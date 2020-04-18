
package com.heathcasey.jakeeobserverpattern.controller;

import com.heathcasey.jakeeobserverpattern.model.SalesReport;
import com.heathcasey.jakeeobserverpattern.utils.OrderUtil;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

/**
 *
 * @author Heath
 */
@ApplicationScoped
public class SalesReportService {
    
    @Inject 
    private SalesReport salesReport;
    @Inject
    private SalesOrderRepository sorepo;
    @PostConstruct
    public void init(){
        buildReport();
    }
            
    public void buildReport(){
        System.out.println("Building Sales Report");
        salesReport = new SalesReport();
        salesReport.setReportGenerationDate(new Date());
        salesReport.setTotalOrders(sorepo.getSalesOrders().size());
        salesReport.setTotalSales(OrderUtil.calculateTotalSales(sorepo.getSalesOrders()));
        Integer totalProductQty=OrderUtil.calculateToalQty(sorepo.getSalesOrders());
        salesReport.setAvgSalesPerOrder(
        salesReport.getTotalSales().divide(BigDecimal.valueOf(sorepo.getSalesOrders().size()))
        );
        salesReport.setAvgQtyPerOrder(BigDecimal.valueOf(totalProductQty/sorepo.getSalesOrders().size()));
        
    }   

    public SalesReport getSalesReport() {
        return salesReport;
    }

    
    
    
}
