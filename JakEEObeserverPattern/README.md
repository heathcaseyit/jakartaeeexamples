# Demo
This is a demo of the Jakarta EE 8 CDI @Observe api.

The Html Order form submits order data to a Java EE webservice endpoint.

The Create New Order method fires an event notifying the Observer methods that a new sales order has been created.

The observer method then compiles a new report with the current sales data.



