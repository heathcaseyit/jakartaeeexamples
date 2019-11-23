
package com.heathcasey.jakeeobserverpattern.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.enterprise.context.Dependent;

/**
 *
 * @author Heath
 */
@Dependent
public class SalesReport {
    private Date reportGenerationDate;
    private BigDecimal totalSales;
    private Integer totalOrders;
    private BigDecimal avgSalesPerOrder;
    private BigDecimal avgQtyPerOrder;

    public SalesReport() {
    }

    public Date getReportGenerationDate() {
        return reportGenerationDate;
    }

    public void setReportGenerationDate(Date reportGenerationDate) {
        this.reportGenerationDate = reportGenerationDate;
    }

    public BigDecimal getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(BigDecimal totalSales) {
        this.totalSales = totalSales;
    }

    public Integer getTotalOrders() {
        return totalOrders;
    }

    public void setTotalOrders(Integer totalOrders) {
        this.totalOrders = totalOrders;
    }

    public BigDecimal getAvgSalesPerOrder() {
        return avgSalesPerOrder;
    }

    public void setAvgSalesPerOrder(BigDecimal avgSalesPerOrder) {
        this.avgSalesPerOrder = avgSalesPerOrder;
    }

    public BigDecimal getAvgQtyPerOrder() {
        return avgQtyPerOrder;
    }

    public void setAvgQtyPerOrder(BigDecimal avgQtyPerOrder) {
        this.avgQtyPerOrder = avgQtyPerOrder;
    }
    
    
    
    
}
