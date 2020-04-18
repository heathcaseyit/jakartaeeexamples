
package com.heathcasey.jakeeobserverpattern.controller;

import com.heathcasey.jakeeobserverpattern.model.ProductOrder;
import com.heathcasey.jakeeobserverpattern.model.SalesOrder;
import com.heathcasey.jakeeobserverpattern.utils.OrderUtil;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

/**
 *
 * @author Heath
 */
@ApplicationScoped
public class SalesOrderRepository {
    private List<SalesOrder> salesOrders;
    private SalesOrder salesOrder;
    private List<ProductOrder> productOrders;
    
    @Inject
    ProductRepository productRepository;
    
    @Inject
    CustomerRepository customerRepository;
    
    @PostConstruct
    public void init(){
        //Adding some default data for testing.
        productOrders=new ArrayList<>();
        productOrders.add(new ProductOrder
                .Builder()
                .setId(1)
                .setProduct(productRepository.getProducts().stream().filter(e->e.getName().equals("Bazzlesnitch")).findFirst().get())
                .setUnitQuantity(1)
                .build()
        );
        productOrders.add(new ProductOrder
                .Builder()
                .setId(1)
                .setProduct(productRepository.getProducts().stream().filter(e->e.getName().equals("Widget")).findFirst().get())
                .setUnitQuantity(1)
                .build()
        );
    
        salesOrders=new ArrayList<>();
        salesOrder = new SalesOrder.Builder()
                .setId(1)
                .setCustomer(customerRepository.getCustomers().stream().filter(e->e.getId().equals(6)).findFirst().get())
                .setOrderDate(new Date())
                .setProduct(productOrders)
                .setTotalCost(OrderUtil.calculateTotalCost(productOrders))
                .build();
        salesOrders.add(salesOrder);
    }

    public List<SalesOrder> getSalesOrders() {
        return salesOrders;
    }

    public void setSalesOrders(List<SalesOrder> salesOrders) {
        this.salesOrders = salesOrders;
    }

    public SalesOrder getSalesOrder() {
        return salesOrder;
    }

    public void setSalesOrder(SalesOrder salesOrder) {
        this.salesOrder = salesOrder;
    }

    public List<ProductOrder> getProductOrders() {
        return productOrders;
    }

    public void setProductOrders(List<ProductOrder> productOrders) {
        this.productOrders = productOrders;
    }
    
    public void prepareCreate(){
        this.productOrders=new ArrayList<>();
        this.salesOrder=new SalesOrder.Builder().setProduct(productOrders).build();
    }
    
    public SalesOrder create(Integer customerId,HashMap<Integer,Integer> productcart){
        prepareCreate();
        for(Integer i:productcart.keySet()){
            ProductOrder po=new ProductOrder.Builder()
                    .setUnitQuantity(productcart.get(i))
                    .setProduct(productRepository.getProducts().stream().filter(e->e.getId().equals(i)).findFirst().get())
                    .setId(i)
                    .build();
            this.salesOrder.getProduct().add(po);
        }
        //Just getting a new integer to simulate a primary key.
        this.salesOrder.setId(this.salesOrders.stream().map(SalesOrder::getId).max(Integer::compare).get()+1);
        this.salesOrder.setOrderDate(new Date());
        this.salesOrder.setCustomer(this.customerRepository.getCustomers().stream().filter(e->e.getId().equals(customerId)).findFirst().get());
        this.salesOrder.setTotalCost(OrderUtil.calculateTotalCost(this.salesOrder.getProduct()));
        this.salesOrders.add(salesOrder);
        return this.salesOrder;
    }
    
    
    
}
