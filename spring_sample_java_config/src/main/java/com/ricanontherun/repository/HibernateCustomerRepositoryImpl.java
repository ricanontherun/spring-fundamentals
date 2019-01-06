package com.ricanontherun.repository;

import java.util.ArrayList;
import java.util.List;

import com.ricanontherun.model.Customer;

import org.springframework.stereotype.Repository;

// Define this as a bean
@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    public List<Customer> findAll() {
        List<Customer> customerList = new ArrayList<>();

        Customer christian = new Customer();
        christian.setFirstName("Christian").setLastName("Roman");
        customerList.add(christian);

        Customer natalie = new Customer();
        natalie.setFirstName("Natalie").setLastName("Trach");
        customerList.add(natalie);

        return customerList;
    }
}