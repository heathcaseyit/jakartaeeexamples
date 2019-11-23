
package com.heathcasey.jakeeobserverpattern.model;

import java.io.Serializable;
import java.util.Objects;
import javax.enterprise.context.Dependent;

/**
 *
 * @author Heath
 */
@Dependent
public class Customer implements Serializable{
    private Integer id;
    private String name;
    private String shippingAddress;
    private String billingAddress;
    private String phoneNumber;
    private String email;

    public Customer() {
    }
    

    public Customer(Integer id, String name, String shippingAddress, String billingAddress, String phoneNumber, String email) {
        this.id = id;
        this.name = name;
        this.shippingAddress = shippingAddress;
        this.billingAddress = billingAddress;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + Objects.hashCode(this.id);
        hash = 11 * hash + Objects.hashCode(this.name);
        hash = 11 * hash + Objects.hashCode(this.shippingAddress);
        hash = 11 * hash + Objects.hashCode(this.billingAddress);
        hash = 11 * hash + Objects.hashCode(this.phoneNumber);
        hash = 11 * hash + Objects.hashCode(this.email);
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
        final Customer other = (Customer) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Customer{id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", shippingAddress=").append(shippingAddress);
        sb.append(", billingAddress=").append(billingAddress);
        sb.append(", phoneNumber=").append(phoneNumber);
        sb.append(", email=").append(email);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
