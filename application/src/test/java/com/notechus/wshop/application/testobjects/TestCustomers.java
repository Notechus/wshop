package com.notechus.wshop.application.testobjects;

import com.notechus.wshop.application.builder.CustomerBuilder;
import com.notechus.wshop.domain.entity.customer.Address;
import com.notechus.wshop.domain.entity.customer.Customer;

/**
 * @author notechus.
 */
public class TestCustomers {

    private static CustomerBuilder builder = new CustomerBuilder();

    public static Customer regularCustomer() {
        return builder.withId(1L)
                .withFirstName("Sebastian").withLastName("Paulus")
                .withEmail("myemail@email.com").withAddress(new Address())
                .withPhoneNumber("123123123").build();
    }
}
