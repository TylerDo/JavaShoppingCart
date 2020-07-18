/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingcart;

/**
 *
 * @author Tyler
 */
public class Product {
    private String name;
    private String type;
    private int quantity;
    private double price;
    
    public Product(){//Default constructor
        name = "";
        type = "";
        quantity = 0;
        price = 0;
    }
    //Parameter Constuctor
    public Product(String name, String type, Integer quantity, Double price){//Set values
        this.name= name;
        this.type = type;
        this.quantity = quantity;
        this.price = price;
    }
    //Getters and Setters
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", type=" + type + ", quantity=" + quantity + ", price=" + price + '}';
    }
    
    
}


