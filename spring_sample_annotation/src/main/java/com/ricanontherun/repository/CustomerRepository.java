package com.ricanontherun.repository;

import java.util.List;

import com.ricanontherun.model.Customer;

public interface CustomerRepository {
    /**
     * Find all customers.
     *
     * @return List<Customer>
     */
    List<Customer> findAll();
}