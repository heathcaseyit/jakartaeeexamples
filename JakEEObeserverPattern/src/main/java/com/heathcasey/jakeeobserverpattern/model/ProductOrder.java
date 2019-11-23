
package com.heathcasey.jakeeobserverpattern.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;
import javax.enterprise.context.Dependent;

/**
 *
 * @author Heath
 */
@Dependent
public class ProductOrder implements Serializable {

    private Integer id;
    private Product product;
    private Integer unitQuantity;

    public ProductOrder() {
    }

    
    public static class Builder {

        private Integer id;
        private Product product;
        private Integer unitQuantity;

        public Builder() {
        }

        public Builder setId(Integer id) {
            this.id = id;
            return this;
        }

        public Builder setProduct(Product product) {
            this.product = product;
            return this;
        }


        public Builder setUnitQuantity(Integer unitQuantity) {
            this.unitQuantity = unitQuantity;
            return this;
        }

        public ProductOrder build() {
            return new ProductOrder(id, product, unitQuantity);
        }
    }

    public ProductOrder(Integer id, Product product,  Integer unitQuantity) {
        this.id = id;
        this.product = product;
        this.unitQuantity = unitQuantity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

  

    public Integer getUnitQuantity() {
        return unitQuantity;
    }

    public void setUnitQuantity(Integer unitQuantity) {
        this.unitQuantity = unitQuantity;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.id);
        hash = 83 * hash + Objects.hashCode(this.product);
        hash = 83 * hash + Objects.hashCode(this.unitQuantity);
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
        final ProductOrder other = (ProductOrder) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProductOrder{id=").append(id);
        sb.append(", product=").append(product);
        sb.append(", unitQuantity=").append(unitQuantity);
        sb.append('}');
        return sb.toString();
    }

    
}
