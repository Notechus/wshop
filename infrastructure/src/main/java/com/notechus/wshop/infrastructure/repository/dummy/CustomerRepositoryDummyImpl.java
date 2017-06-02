package com.notechus.wshop.infrastructure.repository.dummy;

import com.notechus.wshop.domain.entity.customer.Customer;
import com.notechus.wshop.domain.repository.CustomerRepository;
import com.notechus.wshop.util.repository.AbstractDummyRepository;

/**
 * @author notechus.
 */
public class CustomerRepositoryDummyImpl extends AbstractDummyRepository<Customer, Long> implements CustomerRepository {
}
