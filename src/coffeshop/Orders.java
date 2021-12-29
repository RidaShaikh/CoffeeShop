/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffeshop;

import java.io.Serializable;

/**
 *
 * @author Rai Waqar
 */
public class Orders implements Serializable {
    
    private String customerName;
    private String coffeeName;
    private int quantity;
    private double price;
    
    public Orders(String customerName, String coffeeName, int quantity, double price) {
        
        this.customerName = customerName;
        this.coffeeName = coffeeName;
        this.quantity = quantity;
        this.price = price;
        
    }
    
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setCoffeeName(String coffeeName) {
        this.coffeeName = coffeeName;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    
    public String getCustomerName() {
        return this.customerName;
    }
    public String getCoffeeName() {
        return this.coffeeName;
    }
    public int getQuantity() {
        return this.quantity;
    }
    public double getPrice() {
        return this.price;
    }
    
}
