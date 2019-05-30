package com.mycompany.info.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.info.domain.EmployeeDetails;
import com.mycompany.info.repository.EmployeeDetailsRepository;


@Service
public class EmployeeDetailsServiceImpl implements  EmployeeDetailsService {
	

	@Autowired
	private EmployeeDetailsRepository employeeDetailsRepository ;
	
	@Override
	public EmployeeDetails getEmployeeDetailsById ( int employeeId ) throws Exception{
		return employeeDetailsRepository.getEmployeeDetailsById( employeeId );
	}

}
