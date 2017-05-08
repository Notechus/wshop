package com.notechus.wshop.application.service;

import com.notechus.wshop.domain.entity.order.Order;
import com.notechus.wshop.domain.entity.product.Product;

import java.util.List;

/**
 * @author notechus.
 */
public interface OrderService {

    //TODO FIXME: do we ask for delivery price or have it predefined
    Order createOrder(Long clientID, List<Product> products);

    Order cancelOrder(Long id);

    List<Order> findAll();
}
