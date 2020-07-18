/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingcart;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tyler
 */
public class Cart {
    
    List<Product> cartProducts = new ArrayList<Product>();

    private Product getProduct(String name){
        Product product = null;
        List<Product> products = new ProductList().getProducts();
        for(Product prod: products)
        {
            if(prod.getName() == name)
            {
                product = prod;
                break;
            }
        }
        return product;
    }
    
    public void addProduct(String name){
        Product product = getProduct(name);
        addProductToCart(product);
    }
    
    private void addProductToCart(Product product){
        cartProducts.add(product);
    }
    
    public void removeProduct(String name){
        Product product = getProduct(name);
        cartProducts.remove(product);
    }
    
}
