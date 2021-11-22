package com.cwg.cust.demo.cwg.Controller;

import com.cwg.cust.demo.cwg.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController<Customer, customer> {

    @Autowired
    CustomerService customerService;

    @RequestMapping(value = "/customer", method = RequestMethod.GET)
    <customerService>
    ResponseEntity<Iterable<customerService>> getAll() {
        Iterable <customerService> customers = customerService.getAllCustomers();
        return ResponseEntity.ok(customers);
    }

    @RequestMapping(value = "/customer/{id}", method = RequestMethod.GET)
    ResponseEntity<Object> getProduct(@PathVariable int id) {
        Object customer = customerService.getProductById(id);
        return ResponseEntity.ok(customer);
    }

    @RequestMapping(value = "/customer", method = RequestMethod.POST)
    ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
        customerService.createCustomer(customer);
        return ResponseEntity.ok(customer);
    }
}
