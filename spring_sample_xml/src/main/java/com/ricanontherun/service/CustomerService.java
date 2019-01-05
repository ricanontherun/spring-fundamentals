package com.ricanontherun.service;

import java.util.List;

import com.ricanontherun.model.Customer;

public interface CustomerService {
    List<Customer> findAll();
}