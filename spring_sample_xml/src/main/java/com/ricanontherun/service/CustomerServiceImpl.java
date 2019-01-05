package com.ricanontherun.service;

import com.ricanontherun.model.Customer;
import com.ricanontherun.repository.CustomerRepository;
import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    private CustomerRepository customerRepository;

    public CustomerServiceImpl() {}

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        System.out.println("constructor");
        this.customerRepository = customerRepository;
    }

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    /**
     * @param customerRepository the customerRepository to set
     */
    public void setCustomerRepository(CustomerRepository customerRepository) {
        System.out.println("setter");
        this.customerRepository = customerRepository;
    }
}