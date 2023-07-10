package com.asde.dbconnect;

import java.sql.SQLException;
import java.util.List;

import com.asde.dbconnect.dao.EmployeeDAO;
import com.asde.dbconnect.entities.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException
    {
    	  
    			/*
    			 * EmployeeDAOImpl empdaoimpl=new EmployeeDAOImpl(); Employee e1=new Employee();
    			 * e1.setEmployeeId(1); List l=empdaoimpl.searchEmployee(e1);
    			 * System.out.println(l);
    			 */
    			 

    			System.out.println("Searching Employee by Designation");
    			EmployeeDAO empdaoimpl = new EmployeeDAO(); // Employee e1=new
    			List l = empdaoimpl.searchEmployeeByDesignation("Senior Associate");
    			System.out.println(l);
    			System.out.println("Searching Employee by ID");
    						  
    						  
    		    Employee emp=new Employee();
    			emp.setEmployeeId(1);
    			List l2 = empdaoimpl.searchEmployee(emp);
    			System.out.println(l2);

    }
}