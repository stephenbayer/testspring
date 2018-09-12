package com.stephenbayer.testspring.service;

import com.stephenbayer.testspring.model.Customer;
import com.stephenbayer.testspring.repository.CustomerRepository;
import com.stephenbayer.testspring.repository.HibernateCustomerRepositoryImpl;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
