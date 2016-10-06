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
public class QtyDiscount implements DiscountStrategy{
    private double minQty;    
    private double discountRate;

    public QtyDiscount(double minQty, double discountRate) {
        setDiscountRate(discountRate);
        setMinQty(minQty);
    }   
    
    @Override
    public final double getDiscountAmt(int qty, double unitCost) {
        //needs validation
        if(qty >= minQty){
            return discountRate;
        } 
        return 0;
    }   

    public final double getMinQty() {
        return minQty;
    }

    public final void setMinQty(double minQty) {
        this.minQty = minQty;
    }

    public final double getDiscountRate() {
        return discountRate;
    }

    public final void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
   
}
