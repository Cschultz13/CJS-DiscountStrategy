/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cjs.discountstrategy;

/**
 *
 * @author Carson Schultz
 */
public class Customer {
    private String customerID;
    private String customerName;

    public Customer(String customerID, String customerName) {
        this.customerID = customerID;
        this.customerName = customerName;
    }

    public final String getCustomerID() {
        return customerID;
    }

    public final void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public final String getCustomerName() {
        return customerName;
    }

    public final void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    
    
}
