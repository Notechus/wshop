package com.notechus.wshop.application.service;

import com.notechus.wshop.domain.entity.customer.Customer;

import java.util.List;

/**
 * @author notechus.
 */
public interface CustomerService {

    List<Customer> findAll();
}
