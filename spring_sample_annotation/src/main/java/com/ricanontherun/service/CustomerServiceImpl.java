package com.ricanontherun.service;

import com.ricanontherun.model.Customer;
import com.ricanontherun.repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
    private CustomerRepository customerRepository;

    public CustomerServiceImpl() {}

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    /**
     * @return the customerRepository
     */
    public CustomerRepository getCustomerRepository() {
        return customerRepository;
    }

    /**
     * @param customerRepository the customerRepository to set
     */
    public void setCustomerRepository(CustomerRepository customerRepository) {
        System.out.println("Autowired is using the setter.");
        this.customerRepository = customerRepository;
    }

}