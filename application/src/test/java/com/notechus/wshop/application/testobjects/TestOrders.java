package com.notechus.wshop.application.testobjects;

import com.notechus.wshop.application.builder.OrderBuilder;
import com.notechus.wshop.domain.entity.order.Order;
import com.notechus.wshop.domain.entity.order.OrderItem;
import com.notechus.wshop.domain.entity.order.Parcel;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Collections;

/**
 * @author notechus.
 */
public class TestOrders {

    private static OrderBuilder builder = new OrderBuilder();

    public static Order regularOrder() {
        return builder.withId(1L).withCustomer(TestCustomers.regularCustomer())
                .withOrderDate(LocalDateTime.of(2017, 10, 9, 10, 0))
                .withTotalPrice(BigDecimal.ONE)
                .withShippingPrice(BigDecimal.ONE)
                .withOrderItems(Collections.singletonList(new OrderItem()))
                .withParcel(new Parcel()).build();
    }
}
