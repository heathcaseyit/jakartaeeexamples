
package com.heathcasey.jakeeobserverpattern.controller;

import com.heathcasey.jakeeobserverpattern.model.Product;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author Heath
 */
@ApplicationScoped
public class ProductRepository {
    private List<Product> products;
    private Product product;
    
    @PostConstruct
    public void init(){
        //Adding some product to use for testing
        this.products=new ArrayList<>();
        product=new Product(1, "Widget", new BigDecimal("6.5"), new BigDecimal("13.8"), new BigDecimal("13.8"), new BigDecimal("14.0"), true, false,new BigDecimal("28.00"));
        this.products.add(product);
        this.products.add(new Product(2, "Zazzle", new BigDecimal("25.3"), new BigDecimal("27.6"), new BigDecimal("13.8"), new BigDecimal("28.0"), true, true,new BigDecimal("107.00")));
        this.products.add(new Product(3, "Smogden", new BigDecimal("1.5"), new BigDecimal("11.8"), new BigDecimal("8.8"), new BigDecimal("14.0"), false, false,new BigDecimal("250.99")));
        this.products.add(new Product(4, "Frodoor", new BigDecimal("45.0"), new BigDecimal("37.8"), new BigDecimal("48.8"), new BigDecimal("37.0"), false, false,new BigDecimal("28.50")));
        this.products.add(new Product(5, "Bazzlesnitch", new BigDecimal("21.7"), new BigDecimal("8.8"), new BigDecimal("61.6"), new BigDecimal("7.0"), false, true,new BigDecimal("125.99")));
        this.products.add(new Product(6, "Frothbumbble", new BigDecimal("3.2"), new BigDecimal("8.2"), new BigDecimal("13.8"), new BigDecimal("9.0"), true, false,new BigDecimal("24.99")));
        this.products.add(new Product(7, "Hodgeton", new BigDecimal("2.7"), new BigDecimal("9.7"), new BigDecimal("8.8"), new BigDecimal("6.0"), true, false,new BigDecimal("9.99")));
        this.products.add(new Product(8, "Pomplamoose", new BigDecimal("1.9"), new BigDecimal("6.5"), new BigDecimal("10.8"), new BigDecimal("10.0"), true, false,new BigDecimal("13.99")));
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    
    
    
}
