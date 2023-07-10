package com.asde.dbconnect.service;

import java.sql.SQLException;
import java.util.List;

import com.asde.dbconnect.entities.Employee;

public interface IEmployeeService {
	List getEmployeeById(Employee employee)throws SQLException ;
	List getEmployeeByDesignation(String skill)throws SQLException ;
}
