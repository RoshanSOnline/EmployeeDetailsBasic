package com.mycompany.info.repository;

import com.mycompany.info.domain.EmployeeDetails;

public interface EmployeeDetailsRepository {

	public EmployeeDetails getEmployeeDetailsById ( int employeeId ) throws Exception;
}
