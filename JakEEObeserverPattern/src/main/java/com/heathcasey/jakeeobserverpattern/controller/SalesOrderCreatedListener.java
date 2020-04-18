
package com.heathcasey.jakeeobserverpattern.controller;



import javax.enterprise.event.ObservesAsync;
import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Event listener that will rebuild
 * a total sales report every time
 * a new sales order created event is fired
 * @author Heath
 */
@Singleton
public class SalesOrderCreatedListener {
    @Inject
    SalesReportService salesReportService;
    public void onSalesOrderCreated(@ObservesAsync SalesOrderCreated event){
        System.out.println("Sales Order Created Async Event Fired.");
        salesReportService.buildReport();
        
    }
    
}
