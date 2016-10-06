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
public class FakeDatabase implements StorageStrategy {

    private Customer[] customers = {
        new Customer("100", "Carson Schultz"),
        new Customer("101", "Jim Lombardo"),
        new Customer("103", "Billy Bob")
    };
    private Product[] products ={
        new Product("105","Cowboy Boots", 100, new NoDiscount()),
        new Product("207","Jeans", 30, new FlatAmtDiscount(5)),
        new Product("208","T-Shirt",15, new QtyDiscount(4, 15))
    };
}
