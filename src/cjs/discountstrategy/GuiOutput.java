/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cjs.discountstrategy;

import javax.swing.JOptionPane;

/**
 *
 * @author Carson Schultz
 */
public class GuiOutput implements OutputStrategy{

    @Override
    public final void outputReceipt(Receipt r) {
        //needs validation
        JOptionPane.showMessageDialog(null, r);
    }
    
}
