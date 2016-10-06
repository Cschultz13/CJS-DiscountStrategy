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
public class PercentOffDiscount implements DiscountStrategy{
    private double percentOff = 0.1;
    
    @Override
    public final double getDiscountAmt(int qty, double unitCost) {
        //needs validation
        return unitCost * qty * this.percentOff;
    }

    public final double getPercentOff() {
        return percentOff;
    }

    public final void setPercentOff(double percentOff) {
        this.percentOff = percentOff;
    }
        
}
