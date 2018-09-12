package com.stephenbayer.testspring.repository;

import com.stephenbayer.testspring.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
    @Override
    public List<Customer> findAll() {

        List<Customer> customers = new ArrayList<>();

        Customer customer = new Customer();
        customer.setFirstName("Stephen");
        customer.setLastName("Bayer");

        customers.add(customer);

        return customers;
    }
}
