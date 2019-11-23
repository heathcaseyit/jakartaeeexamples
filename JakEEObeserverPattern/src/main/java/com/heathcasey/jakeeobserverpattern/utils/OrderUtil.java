
package com.heathcasey.jakeeobserverpattern.utils;

import com.heathcasey.jakeeobserverpattern.model.ProductOrder;
import com.heathcasey.jakeeobserverpattern.model.SalesOrder;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.List;

/**
 *
 * @author Heath
 */
public class OrderUtil {

    public static BigDecimal calculateTotalCost(List<ProductOrder> productOrders) {
        BigDecimal rtnVal = BigDecimal.ZERO;

        if (productOrders != null && productOrders.size() > 0) {
            for (ProductOrder po : productOrders) {
                rtnVal = rtnVal.add(
                        po.getProduct().getRetailprice().multiply(BigDecimal.valueOf(po.getUnitQuantity().doubleValue())),
                         MathContext.DECIMAL32
                );
            }
        }

        return rtnVal;
    }

    public static BigDecimal calculateTotalSales(List<SalesOrder> salesOrders) {
        
        return salesOrders.stream().map(SalesOrder::getTotalCost).reduce(BigDecimal.ZERO,BigDecimal::add);
    }
    
    public static Integer calculateToalQty(List<SalesOrder> salesOrders) {
        Integer total=0;
        for(SalesOrder so:salesOrders){
            total += so.getProduct().size();
        }
        return total;
    }

}
