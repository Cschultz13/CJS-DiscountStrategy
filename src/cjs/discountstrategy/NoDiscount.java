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
public class NoDiscount implements DiscountStrategy{
    private final double DISCOUNT_RATE = 0;

    @Override
    public final double getDiscountAmt(int qty, double unitCost) {
        //needs validation
        return DISCOUNT_RATE;
    }
    
    
}
