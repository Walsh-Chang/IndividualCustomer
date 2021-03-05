/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chrismi.individualcustomer;

  
import java.util.Set;
import javax.ws.rs.ApplicationPath;  
import javax.ws.rs.core.Application;  
  
@ApplicationPath("/api")    
public class MyApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<Class<?>>();
        addRestResourceClasses(resources);
        return resources;
    }

    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(com.chrismi.individualcustomer.CustomerService.class);
    }
}



