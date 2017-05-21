package com.notechus.wshop.application.service.impl;

import com.notechus.wshop.application.service.CustomerService;
import com.notechus.wshop.application.testobjects.TestCustomers;
import com.notechus.wshop.domain.entity.customer.Customer;
import com.notechus.wshop.domain.repository.CustomerRepository;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

/**
 * @author notechus.
 */
public class CustomerServiceImplTest {

    private CustomerRepository repository = Mockito.mock(CustomerRepository.class);

    private CustomerService customerService = new CustomerServiceImpl(repository);

    @Test
    public void shouldFindAllCustomers() {
        //given
        List<Customer> expectedCustomers = Collections.singletonList(TestCustomers.regularCustomer());
        when(repository.findAll()).thenReturn(expectedCustomers);

        List<Customer> customerList = customerService.findAll();

        assertEquals(expectedCustomers, customerList);
    }

}