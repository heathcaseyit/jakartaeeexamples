
package com.heathcasey.jakeeobserverpattern.model;

import java.math.BigDecimal;
import java.util.Objects;
import javax.enterprise.context.Dependent;

/**
 *
 * @author Heath
 */
@Dependent
public class Product {
    private Integer id;
    private String name;
    private BigDecimal shippingWeight;
    private BigDecimal packageWidth;
    private BigDecimal packageHeight;
    private BigDecimal packageDepth;
    private Boolean fragile;
    private Boolean hazardous;
     private BigDecimal retailprice;

    public Product() {
    }

     
    public Product(Integer id, String name, BigDecimal shippingWeight, BigDecimal packageWidth, BigDecimal packageHeight, BigDecimal packageDepth, Boolean fragile, Boolean hazardous, BigDecimal retailprice) {
        this.id = id;
        this.name = name;
        this.shippingWeight = shippingWeight;
        this.packageWidth = packageWidth;
        this.packageHeight = packageHeight;
        this.packageDepth = packageDepth;
        this.fragile = fragile;
        this.hazardous = hazardous;
        this.retailprice = retailprice;
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

    public BigDecimal getShippingWeight() {
        return shippingWeight;
    }

    public void setShippingWeight(BigDecimal shippingWeight) {
        this.shippingWeight = shippingWeight;
    }

    public BigDecimal getPackageWidth() {
        return packageWidth;
    }

    public void setPackageWidth(BigDecimal packageWidth) {
        this.packageWidth = packageWidth;
    }

    public BigDecimal getPackageHeight() {
        return packageHeight;
    }

    public void setPackageHeight(BigDecimal packageHeight) {
        this.packageHeight = packageHeight;
    }

    public BigDecimal getPackageDepth() {
        return packageDepth;
    }

    public void setPackageDepth(BigDecimal packageDepth) {
        this.packageDepth = packageDepth;
    }

    public Boolean getFragile() {
        return fragile;
    }

    public void setFragile(Boolean fragile) {
        this.fragile = fragile;
    }

    public Boolean getHazardous() {
        return hazardous;
    }

    public void setHazardous(Boolean hazardous) {
        this.hazardous = hazardous;
    }

    public BigDecimal getRetailprice() {
        return retailprice;
    }

    public void setRetailprice(BigDecimal retailprice) {
        this.retailprice = retailprice;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id);
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + Objects.hashCode(this.shippingWeight);
        hash = 97 * hash + Objects.hashCode(this.packageWidth);
        hash = 97 * hash + Objects.hashCode(this.packageHeight);
        hash = 97 * hash + Objects.hashCode(this.packageDepth);
        hash = 97 * hash + Objects.hashCode(this.fragile);
        hash = 97 * hash + Objects.hashCode(this.hazardous);
        hash = 97 * hash + Objects.hashCode(this.retailprice);
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
        final Product other = (Product) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Product{id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", shippingWeight=").append(shippingWeight);
        sb.append(", packageWidth=").append(packageWidth);
        sb.append(", packageHeight=").append(packageHeight);
        sb.append(", packageDepth=").append(packageDepth);
        sb.append(", fragile=").append(fragile);
        sb.append(", hazardous=").append(hazardous);
        sb.append(", retailprice=").append(retailprice);
        sb.append('}');
        return sb.toString();
    }

    
    
    
    
}
