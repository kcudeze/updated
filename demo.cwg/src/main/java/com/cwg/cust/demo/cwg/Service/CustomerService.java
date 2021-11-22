package com.cwg.cust.demo.cwg.Service;

import com.cwg.cust.demo.cwg.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@SuppressWarnings("ALL")
@Service
public class CustomerService<Customer> {
    @Autowired
    private CustomerRepository CustomerRepository;

    public void createCustomer(Customer customer) {
        CustomerRepository.save(customer);

}
    public Iterable<Customer> getAllCustomers() {
        return CustomerRepository.findAll();
    }

    public Object getProductById(int id) {
        return CustomerRepository.findById(id).get();
    }

}

