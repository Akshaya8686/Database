package com.asde.dbconnect.service;

import java.sql.SQLException;
import java.util.List;

import com.asde.dbconnect.dao.EmployeeDAO;
import com.asde.dbconnect.entities.Employee;

public class EmployeeService implements IEmployeeService
{
	private EmployeeDAO empDAO;
	public EmployeeService(EmployeeDAO empDAO) {
		this.empDAO=empDAO;
		
	}
	
	public List getEmployeeById(Employee employee) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public List getEmployeeByDesignation(String skill) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
