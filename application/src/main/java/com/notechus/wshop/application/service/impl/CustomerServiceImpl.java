package com.notechus.wshop.application.service.impl;

import com.google.inject.Inject;
import com.notechus.wshop.application.service.CustomerService;
import com.notechus.wshop.domain.entity.customer.Customer;
import com.notechus.wshop.domain.repository.CustomerRepository;

import java.util.List;

/**
 * @author notechus.
 */
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository repository;

    @Inject
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.repository = customerRepository;
    }

    @Override
    public List<Customer> findAll() {
        return repository.findAll();
    }
}
