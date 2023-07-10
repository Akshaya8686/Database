package com.asde.dbconnect.util.connection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionManager
{

Connection c=null;

public Connection getConnection()
{
    try {
       
    	  Class.forName("com.mysql.cj.jdbc.Driver");
    	 	  		
       c= DriverManager.getConnection("jdbc:mysql://localhost:3306/publicisDB","root","root");
     
       if(c!=null)
      {
    	  
    	  //System.out.println("Connected Succesfully");
      }
      
      } catch (ClassNotFoundException ce)
      {
      throw new RuntimeException("Driver Problem", ce);
      }
      catch (SQLException se ) {
    	  
    	  throw new RuntimeException("Error connecting to the database", se);
      
      }
    
    return c;
    

}





}