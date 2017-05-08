package com.notechus.wshop.application.service.impl;

import com.notechus.wshop.application.service.OrderService;
import com.notechus.wshop.domain.entity.order.Order;
import com.notechus.wshop.domain.entity.product.Product;
import com.notechus.wshop.domain.repository.OrderRepository;

import javax.inject.Inject;
import java.util.List;

/**
 * @author notechus.
 */
public class OrderServiceImpl implements OrderService {

    private OrderRepository orderRepository;

    @Inject
    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Order createOrder(Long clientID, List<Product> products) {
        return null;
    }

    @Override
    public Order cancelOrder(Long id) {
        return null;
    }

    @Override
    public List<Order> findAll() {
        return orderRepository.findAll();
    }
}
