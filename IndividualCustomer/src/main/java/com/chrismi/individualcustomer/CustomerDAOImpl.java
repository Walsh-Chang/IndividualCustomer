package com.chrismi.individualcustomer;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.ws.rs.core.Response;


/**
 *
 * @author mary_tom
 */
public class CustomerDAOImpl {
    
        private static String dbhost = "jdbc:mysql://localhost:3306/Customer";
	private static String username = "mary";
	private static String password = "mtom0001";
        private String dbDriver = "com.mysql.cj.jdbc.Driver";
        
    public void loadDriver(String dbDriver)
	{
		try {
			Class.forName(dbDriver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
    public Connection getConnection()
	{
		Connection con = null;
		try {
			con = DriverManager.getConnection(dbhost, username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	


    public String createCustomer(Customer customer) {
        
        loadDriver(dbDriver);
	Connection con = getConnection();

        String sql = "INSERT INTO customer VALUES (?,?)";
        String result = "Data entered successfully";
        
        PreparedStatement ps;
        
        try{
            con = DriverManager.getConnection(dbhost, username, password); 
            ps=con.prepareStatement(sql);
            ps.setString(1, customer.getName());
            ps.setString(2, customer.getNumber());
            ps.executeUpdate();
            
        } catch (SQLException e) {
           
		System.out.println("Connection Failed! Check output console");
             System.out.println("SQLException: " + e.getMessage());
             System.out.println("SQLState: " + e.getSQLState());
		e.printStackTrace();
                result = "Data not entered";
        
    }
        return result;
    
    }
}
