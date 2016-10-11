/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cjs.discountstrategy;

import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Carson Schultz
 */
public class Receipt {

    private StorageStrategy storage;
    private Customer customer;
    private LineItem[] lineItems;
    private double grandTotal;
    private final Date date = Calendar.getInstance().getTime();
    private final NumberFormat money = NumberFormat.getCurrencyInstance();

    public Receipt(String custId, StorageStrategy storage) {
        setDb(storage);
        setCustomer(storage.findCustomerById(custId));
        lineItems = new LineItem[0];

    }

    public final void addItemToReceipt(String prodId, int qty) {
        LineItem item = new LineItem(prodId, qty, storage);
        addItemToArray(lineItems, item);
    }

    private void addItemToArray(LineItem[] origArray, LineItem item) {
        LineItem[] tempArray = new LineItem[origArray.length + 1];
        System.arraycopy(origArray, 0, tempArray, 0, origArray.length);
        tempArray[tempArray.length - 1] = item;
        origArray = tempArray;
        lineItems = origArray;
    }

    public final LineItem[] getLineItems() {
        return lineItems;
    }

    public final void setLineItems(LineItem[] lineItems) {
        this.lineItems = lineItems;
    }

    public final Customer getCustomer() {
        return customer;
    }

    public final void setCustomer(Customer customer) {
        //needs validation
        this.customer = customer;
    }

    public final StorageStrategy getStorage() {
        return storage;
    }

    public final void setDb(StorageStrategy storage) {
        //needs validation
        this.storage = storage;
    }

    public final double getGrandTotal() {
        return grandTotal;
    }

    public final void setGrandTotal(double GrandTotal) {
        this.grandTotal = GrandTotal;
    }

    public final double getTotalDiscount() {
        grandTotal = 0.0;
        for (LineItem i : lineItems) {
            grandTotal += i.getDiscountAmt();
        }
        return grandTotal;
    }

    public final double getTotalBeforeDiscount() {

        return getTotalAfterDiscount() + getTotalDiscount();
    }

    public final double getTotalAfterDiscount() {
        grandTotal = 0.0;
        for (LineItem lI : lineItems) {
            grandTotal += lI.getSubTotal();
        }
        return grandTotal;
    }

    public final String ReceiptFormat() {
        //formats receipt with the outputs
        double receiptTotal = getTotalAfterDiscount();
        double beforeDiscount = getTotalBeforeDiscount();
        double discountTotal = getTotalDiscount();
        StringBuilder sB;
        sB = new StringBuilder("Customer: " + customer.getCustomerName() + "\n" + "Date: " + date + "\n");
        LineItem[] items = getLineItems();
        for (LineItem i : items) {
            sB.append("\n");
            sB.append("\t Item: \t").append(i.getProductName());
            sB.append("\t QTY: \t").append(i.getQty());
            sB.append("\t SubTotal: \t").append(money.format(i.getSubTotal()));
        }
        sB.append("\n");
        sB.append("Total before discounts: \t").append(money.format(beforeDiscount));
        sB.append("\n");
        sB.append("Grand Total after applied discounts: \t").append(money.format(receiptTotal));
        sB.append("\n");
        sB.append("Total saved: \t").append(money.format(discountTotal));
        String BuildertoString = sB.toString();
        return BuildertoString;
    }
}
