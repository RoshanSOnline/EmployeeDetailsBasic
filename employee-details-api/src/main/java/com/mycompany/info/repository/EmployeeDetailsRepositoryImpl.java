package com.mycompany.info.repository;

import org.springframework.stereotype.Repository;

import com.mycompany.info.domain.EmployeeDetails;

@Repository
public class EmployeeDetailsRepositoryImpl implements EmployeeDetailsRepository {

	@Override
	public EmployeeDetails getEmployeeDetailsById(int employeeId) throws Exception {
		return null;   //  Implementation of getting data  has to do 
	}

}
