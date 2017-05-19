package com.notechus.wshop.application.builder;

import com.notechus.wshop.domain.entity.customer.Customer;
import com.notechus.wshop.domain.entity.order.Order;
import com.notechus.wshop.domain.entity.order.OrderItem;
import com.notechus.wshop.domain.entity.order.Parcel;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author notechus.
 */
public class OrderBuilder {

    private Order order;


    public OrderBuilder() {
        this.order = new Order();
    }

    public OrderBuilder withId(Long id) {
        this.order.setId(id);

        return this;
    }

    public OrderBuilder withTotalPrice(BigDecimal price) {
        this.order.setTotalPrice(price);

        return this;
    }

    public OrderBuilder withShippingPrice(BigDecimal price) {
        this.order.setShippingPrice(price);

        return this;
    }

    public OrderBuilder withOrderItems(List<OrderItem> items) {
        this.order.setOrderItems(items);

        return this;
    }

    public OrderBuilder withCustomer(Customer customer) {
        this.order.setCustomer(customer);

        return this;
    }

    public OrderBuilder withParcel(Parcel parcel) {
        this.order.setParcel(parcel);

        return this;
    }

    public OrderBuilder withOrderDate(LocalDateTime date) {
        this.order.setOrderDate(date);

        return this;
    }

    public Order build() {
        return this.order;
    }
}
