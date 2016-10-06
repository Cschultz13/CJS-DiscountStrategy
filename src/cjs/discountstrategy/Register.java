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
public class Register {
    private Receipt receipt;
    
    public final void startNewSale(String customerID, StorageStrategy storage){
        //needs validation
        
    }
    
    public final void endSale(OutputStrategy output){
        output.outputReceipt(receipt);
    }
    
    public final void addItemToSale(String prodId, int qty){
        //needs validation
        receipt.addItemtoReceipt(prodId,qty);
    }
}
