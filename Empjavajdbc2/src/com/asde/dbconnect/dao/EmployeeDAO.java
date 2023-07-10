package com.asde.dbconnect.dao;


import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.asde.dbconnect.entities.Employee;
import com.asde.dbconnect.util.connection.DBConnectionManager;


public class EmployeeDAO implements IEmployeeDAO
{
	
	
	Connection connection=null; 
	DBConnectionManager d=null;
	//Connection c=null;
	//PreparedStatement ps=null;
	
 public EmployeeDAO() 
{
	 d=new DBConnectionManager();
}
	

	public List searchEmployee(Employee employee) throws SQLException {
		connection=d.getConnection();
		List data=new ArrayList();
		if(connection!=null)
		{
			
		Statement st=connection.createStatement();
ResultSet res=st.executeQuery("SELECT employee_id,first_name,last_name,sur_name,d.desgname,r.rolename FROM employee INNER JOIN designation d ON employee.desgid = d.desgid INNER JOIN role r ON employee.roleid = r.roleid where employee.employee_id="+employee.getEmployeeId());
		if(res.next())
		{
			
			data.add(res.getInt(1));
			data.add(res.getString(2));
			data.add(res.getString(3));
			data.add(res.getString(4));
			data.add(res.getString(5));
			data.add(res.getString(6));
		}
		}
		return data;
		}
	
	
	public List searchEmployeeByDesignation(String des) throws SQLException {
		
		connection=d.getConnection();
		List data=new ArrayList();
		if(connection!=null)
		{
			
		Statement st=connection.createStatement();
ResultSet res=st.executeQuery("SELECT employee_id,first_name,last_name,sur_name,d.desgname FROM employee INNER JOIN designation d ON employee.desgid = d.desgid  where d.desgname='"+des+"'");
		while(res.next())
		{
			
			data.add(res.getInt(1));
			data.add(res.getString(2));
			data.add(res.getString(3));
			data.add(res.getString(4));
			data.add(res.getString(5));
		//	data.add(res.getString(6));
		}
		}
		return data;
	}

}