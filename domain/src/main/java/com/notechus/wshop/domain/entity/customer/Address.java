package com.notechus.wshop.domain.entity.customer;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author notechus.
 */
@Embeddable
public class Address {

    @Column(name = "STREET")
    private String street;
    @Column(name = "CITY")
    private String city;
    @Column(name = "PIN_CODE")
    private String pincode;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
}
