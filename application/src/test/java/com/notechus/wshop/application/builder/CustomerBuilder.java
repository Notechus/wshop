package com.notechus.wshop.application.builder;

import com.notechus.wshop.domain.entity.customer.Address;
import com.notechus.wshop.domain.entity.customer.Customer;

/**
 * @author notechus.
 */
public class CustomerBuilder {

    private Customer customer;

    public CustomerBuilder() {
        this.customer = new Customer();
    }

    public CustomerBuilder withId(Long id) {
        this.customer.setId(id);

        return this;
    }

    public CustomerBuilder withFirstName(String name) {
        this.customer.setFirstName(name);

        return this;
    }

    public CustomerBuilder withLastName(String name) {
        this.customer.setLastName(name);

        return this;
    }

    public CustomerBuilder withEmail(String email) {
        this.customer.setEmail(email);

        return this;
    }

    public CustomerBuilder withAddress(Address address) {
        this.customer.setAddress(address);

        return this;
    }

    public CustomerBuilder withPhoneNumber(String phone) {
        this.customer.setPhoneNumber(phone);

        return this;
    }

    public Customer build() {
        return this.customer;
    }

}
