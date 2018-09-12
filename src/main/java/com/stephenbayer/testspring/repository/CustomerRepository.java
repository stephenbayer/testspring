package com.stephenbayer.testspring.repository;

import com.stephenbayer.testspring.model.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();
}
