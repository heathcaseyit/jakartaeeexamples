
package com.heathcasey.jakeeobserverpattern.boundry;

import com.heathcasey.jakeeobserverpattern.controller.SalesOrderCreated;
import com.heathcasey.jakeeobserverpattern.controller.SalesOrderRepository;
import com.heathcasey.jakeeobserverpattern.model.SalesOrder;
import java.util.HashMap;
import javax.ejb.Stateless;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

/**
 *
 * @author Heath
 */
@Path("salesorder")
@Stateless
public class SalesOrders {

    @Inject
    SalesOrderRepository sor;
    @Inject Event<SalesOrderCreated> salesOrderCreated;

    @GET
    public Response findAllSalesOrders() {
        return Response.ok().entity(sor.getSalesOrders()).build();
    }

    @GET
    @Path("{id}")
    public Response findSalesOrder(@PathParam("id") Integer id) {
        return Response.ok(String.format("Find %s", id)).build();
    }

    @POST
    @Path("new")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response createSalesOrder(MultivaluedMap<String, String> formParams) {
       
        HashMap<Integer, Integer> socreateParams = new HashMap<>();
        Integer customerId=0;
        for (String k : formParams.keySet()) {
            String val = formParams.getFirst(k);
            if (k.equals("customer")) {
                customerId=Integer.valueOf(val);
            } else if (k.startsWith("quantity_")) {
                String temp = k.substring(9);
                socreateParams.put(Integer.valueOf(temp), Integer.valueOf(val));
            }
        }
        SalesOrder rtnVal=sor.create(customerId, socreateParams);
        salesOrderCreated.fireAsync(new SalesOrderCreated());
        return Response.ok().entity(rtnVal).build();
    }

    @POST
    @Path("update/{id}")
    public Response editSalesOrder(@PathParam("id") Integer id) {
        return Response.ok(String.format("Edit %s", id)).build();
    }

    @GET
    @Path("delete/{id}")
    public Response deleteSalesOrder(@PathParam("id") Integer id) {
        return Response.ok(String.format("Delete %s", id)).build();
    }

}
