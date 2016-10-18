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
public class StartUp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StorageStrategy storage = new ArrayDatabase();
        ConsoleOutput console = new ConsoleOutput();
        GuiOutput screen = new GuiOutput();
        
        Register register = new Register();
        register.startNewSale("100", storage);

        //add products and quantity to sale
        register.addItemToSale("105", 2);
        register.addItemToSale("207", 5);
        register.addItemToSale("208", 3);

        //output to screen and console
        register.endSale(screen);
        register.endSale(console);
    }
}
