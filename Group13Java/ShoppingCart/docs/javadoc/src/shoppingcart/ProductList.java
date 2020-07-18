/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingcart;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Tyler
 */
public class ProductList {
    
    private final List<Product> products = new ArrayList<Product>();
    
    public ProductList(){
        this.storeItems();
    }
    
    public List<Product> getProducts(){//Retrieve the list of products
        return products;
    }
    
    public void storeItems(){
        String [] productNames = {"Rottweiler", "Lab", "Dashound" , "Bulldog"};
        String [] productType = {"Dog","Dog","Dog" , "Dog"};
        Integer [] productStock = {10,10,2, 5};
        Double [] productPrice = {0.0,0.0,0.0,0.0};
        
        for (int i = 0; i < productNames.length; i++)
        {
           this.products.add(new Product(productNames[i], productType[i], productStock[i], productPrice[i])); 
        }
    }
}
