package com.asde.dbconnect.dao;

import java.sql.SQLException;
import java.util.List;

import com.asde.dbconnect.entities.Employee;



public interface IEmployeeDAO 
{
	
	
	List searchEmployee(Employee employee)throws SQLException ;
	List searchEmployeeByDesignation(String skill)throws SQLException ;
	
}