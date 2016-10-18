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
   public static final int ID_MIN = 3;
    public static final int ID_MAX = 7;
    public static final int NAME_MIN = 3;
    public static final int NAME_MAX = 7;
    public static final String SPACE = " ";
    public static final int SPC_INDX = -1;
    private String customerId;
    private String customerName;

    public Customer(String customerId, String customerName) {
        setCustomerId(customerId);
        setCustomerName(customerName);
    }

    public final String getCustomerId() {
        return customerId;
    }

    public final void setCustomerId(String customerId)throws IllegalArgumentException {
       
        if (customerId == null || customerId.isEmpty() || customerId.length() < ID_MIN || customerId.length() > ID_MAX) {
            throw new CustomerIdException();
        }
        this.customerId = customerId;
    }
    public final String getCustomerName() {
        return customerName;
    }

    public final void setCustName(String customerName)throws IllegalArgumentException {
       
        if (customerName == null || customerName.isEmpty() ||
                customerName.length() < NAME_MIN || customerName.length() > NAME_MAX ||
                customerName.indexOf(SPACE) == SPC_INDX) {
            throw new IllegalArgumentException();
        }
        this.customerName = customerName;
    }

    public final void setCustomerName(String customerName) {
        this.customerName = customerName;
}

}