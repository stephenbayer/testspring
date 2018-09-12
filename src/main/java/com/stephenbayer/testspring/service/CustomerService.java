package com.stephenbayer.testspring.service;

import com.stephenbayer.testspring.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
}
