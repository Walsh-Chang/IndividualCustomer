/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chrismi.individualcustomer;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


/**
 *
 * @author mary_tom
 */
@Path("customerService")
public class CustomerService {
    
    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.TEXT_PLAIN)
    public String createCustomer(@FormParam("name") String name, 
                    @FormParam("number") String number){
	Customer customer = new Customer(name,number);
        CustomerDAOImpl custDAO = new CustomerDAOImpl();
        custDAO.createCustomer(customer);
        String resp = customer.toString();
        
        return resp;
        
    }
    
}