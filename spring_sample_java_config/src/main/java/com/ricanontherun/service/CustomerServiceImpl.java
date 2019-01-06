package com.ricanontherun.service;

import java.util.List;

import com.ricanontherun.model.Customer;
import com.ricanontherun.repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
    @Value("${dbUsername}")
    private String dbUsername;

    @Autowired
    private CustomerRepository customerRepository;

    /**
     * @param customerRepository the customerRepository to set
     */
    public void setCustomerRepository(CustomerRepository customerRepository) {
        System.out.println("Using setter injection");
        this.customerRepository = customerRepository;
    }

    public List<Customer> findAll() {
        System.out.println(this.dbUsername);
        return customerRepository.findAll();
    }

    /**
     * @return the dbUsername
     */
    public String getDbUsername() {
        return dbUsername;
    }

    /**
     * @param dbUsername the dbUsername to set
     */
    public void setDbUsername(String dbUsername) {
        this.dbUsername = dbUsername;
    }

    /**
     * @return the customerRepository
     */
    public CustomerRepository getCustomerRepository() {
        return customerRepository;
    }
}