
package com.heathcasey.jakeeobserverpattern.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.enterprise.context.Dependent;

/**
 *
 * @author Heath
 */
@Dependent
public class SalesOrder {
    private Integer id;
    private Date orderDate;
    private Customer customer;
    private List<ProductOrder> product;
    private BigDecimal totalCost;

    public SalesOrder() {
    }
    
    
    public static class Builder{
    private Integer id;
    private Date orderDate;
    private Customer customer;
    private List<ProductOrder> product;
    private BigDecimal totalCost;

        public  Builder() {
        }

        public Builder setId(Integer id) {
            this.id = id;
            return this;
        }

        public Builder setOrderDate(Date orderDate) {
            this.orderDate = orderDate;
            return this;
        }

        public Builder setCustomer(Customer customer) {
            this.customer = customer;
            return this;
        }

        public Builder setProduct(List<ProductOrder> product) {
            this.product = product;
            return this;
        }

        public Builder setTotalCost(BigDecimal totalCost) {
            this.totalCost = totalCost;
            return this;
        }
    
        public SalesOrder build(){
            return new SalesOrder(id, orderDate,customer, product,totalCost);
        }
    }

    public SalesOrder(Integer id, Date orderDate, Customer customer, List<ProductOrder> product, BigDecimal totalCost) {
        this.id = id;
        this.orderDate = orderDate;
        this.customer = customer;
        this.product = product;
        this.totalCost = totalCost;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<ProductOrder> getProduct() {
        return product;
    }

    public void setProduct(List<ProductOrder> product) {
        this.product = product;
    }

    public BigDecimal getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(BigDecimal totalCost) {
        this.totalCost = totalCost;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.id);
        hash = 29 * hash + Objects.hashCode(this.orderDate);
        hash = 29 * hash + Objects.hashCode(this.customer);
        hash = 29 * hash + Objects.hashCode(this.product);
        hash = 29 * hash + Objects.hashCode(this.totalCost);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SalesOrder other = (SalesOrder) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SalesOrder{id=").append(id);
        sb.append(", orderDate=").append(orderDate);
        sb.append(", customer=").append(customer);
        sb.append(", product=").append(product);
        sb.append(", totalCost=").append(totalCost);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
