/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chrismi.individualcustomer;

//import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mary_tom
 */
public class Customer {
    
    private String name,number;
    
    @Override
    public String toString() {
	return "Customer [name=" + name + ", number=" + number + "]";
}

    public Customer(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    
    
    
}
