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
public class LineItem {

    private Product product;
    private int qty;
    private double[] subtotals;

    public LineItem(String prodId, int qty, StorageStrategy storage) {
        setProduct(storage.findProductById(prodId));
        this.qty = qty;
        getSubTotal();
    }

    public final String getLineItem() {
        String lineItem = this.getProduct().getProdId() + " " + this.getProduct().getProdName() + " " + this.getQty();
        return lineItem;
    }

    public final String getProductName() {
        return product.getProdName();
    }

    public final Product getProduct() {
        return product;
    }

    public final void setProduct(Product product) {
        this.product = product;
    }

    public final int getQty() {
        return qty;
    }

    public final void setQty(int qty) {
        this.qty = qty;
    }
     public final double getSubTotal() {
        return qty * product.getUnitCost();
    }

    public final double getDiscountAmt() {
        return product.getDiscount().getDiscountAmt(qty, product.getUnitCost());
    }

}
