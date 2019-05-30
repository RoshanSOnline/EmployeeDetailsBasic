package com.mycompany.info.controllers;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mycompany.info.domain.EmployeeDetails;
import com.mycompany.info.service.EmployeeDetailsService;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeDetailsController {

	@Autowired
	private EmployeeDetailsService  employeeDetailsService ;
    private static Logger log = Logger.getLogger(EmployeeDetailsController.class);
	
	@GetMapping( value = "/getEmployeeDetailsById/{employeeId}" )
	public EmployeeDetails getEmployeeDetailsById (@PathVariable int employeeId ) {
		try {
			if ( employeeId != 0 ) {
				return employeeDetailsService.getEmployeeDetailsById  ( employeeId );
			}
		}catch (Exception e) {
			 log.error("****** Exception Occurred in getEmployeeDetailsById ******* "  +  e  );   
		}
		return null;	
	}
}
