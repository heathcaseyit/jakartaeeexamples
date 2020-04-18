
package com.heathcasey.jakeeobserverpattern.controller;

import com.heathcasey.jakeeobserverpattern.model.Customer;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author Heath
 */
@ApplicationScoped
public class CustomerRepository {

    private List<Customer> customers;
    private Customer customer;

    @PostConstruct
    public void init() {
        //Adding some default customer data to mess around with.
        customers = new ArrayList<>();
        customer = new Customer(1, "Vanessa Kensington", "7 Upham Street", "3423 Corscot Pass", "894-334-8092", "jbonds0@dmoz.org");
        customers.add(customer);

        customers.add(new Customer(2, "Basil Exposition", "716 Dexter Point", "0 Artisan Court", "171-803-0523", "bsantoro1@mayoclinic.com"));
        customers.add(new Customer(3, "Number Two", "5 Ruskin Point", "887 Browning Trail", "212-359-4625", "bgerred2@acquirethisname.com"));
        customers.add(new Customer(4, "Scott Evil", "40083 Clove Lane", "71 Meadow Vale Center", "263-215-2022", "pmaccoll3@blog.com"));
        customers.add(new Customer(5, "Patty O'Brien", "34 Basil Crossing", "07581 Kenwood Plaza", "542-682-4711", "gdibaudi4@sogou.com"));
        customers.add(new Customer(6, "Commander Gilmour", "327 International Street", "5 Carey Terrace", "443-153-4433", "olavelle5@behance.net"));
        customers.add(new Customer(7, "Mustafa", "632 Graceland Court", "66 Russell Circle", "640-100-7302", "rfranks6@google.co.uk"));
        customers.add(new Customer(8, "Scotti", "62427 Miller Lane", "922 Riverside Drive", "944-741-6428", "smctrustam7@squarespace.com"));
        customers.add(new Customer(9, "Bettye", "60886 Mccormick Lane", "44 Morningstar Street", "626-662-3530", "bsexon8@csmonitor.com"));
        customers.add(new Customer(10, "Aubrey", "71980 Dixon Alley", "1805 Knutson Place", "870-125-6332", "aviggers9@cam.ac.uk"));
        customers.add(new Customer(11, "Lin", "650 Muir Center", "1 Amoth Center", "710-846-5419", "ldelorenzoa@webs.com"));
        customers.add(new Customer(12, "Ryley", "611 Monterey Center", "72634 Ryan Avenue", "936-466-5529", "rsammsb@miibeian.gov.cn"));
        customers.add(new Customer(13, "Averil", "7 Hagan Road", "87 Clemons Drive", "339-285-9513", "aswyndleyc@sina.com.cn"));
        customers.add(new Customer(14, "Grethel", "8 Spohn Center", "47 Lindbergh Drive", "693-904-6613", "gorhtmannd@last.fm"));
        customers.add(new Customer(15, "Thurston", "42 Coleman Parkway", "3505 Stang Court", "696-936-8073", "tpearne@dropbox.com"));
        customers.add(new Customer(16, "Stevana", "38832 Sugar Pass", "3 South Parkway", "272-108-8014", "slosseljongf@1und1.de"));
        customers.add(new Customer(17, "Floris", "58583 Warbler Drive", "561 Larry Street", "339-350-2778", "fallomg@youtube.com"));
        customers.add(new Customer(18, "Murdoch", "66708 Mallard Park", "83455 Arkansas Point", "689-817-0569", "mmaybeyh@forbes.com"));
        customers.add(new Customer(19, "Barny", "22 Burning Wood Lane", "5146 Crownhardt Lane", "163-320-4766", "bsutherdeni@bloglovin.com"));
        customers.add(new Customer(20, "Peggie", "11 Becker Crossing", "488 Dawn Drive", "808-657-1096", "ppadlyj@walmart.com"));

    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    
}
