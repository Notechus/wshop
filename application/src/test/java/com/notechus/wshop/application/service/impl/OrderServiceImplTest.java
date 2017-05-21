package com.notechus.wshop.application.service.impl;

import com.notechus.wshop.application.service.OrderService;
import com.notechus.wshop.application.testobjects.TestOrders;
import com.notechus.wshop.domain.entity.order.Order;
import com.notechus.wshop.domain.repository.OrderRepository;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

/**
 * @author notechus.
 */
public class OrderServiceImplTest {

    private OrderRepository repository = Mockito.mock(OrderRepository.class);

    private OrderService orderService = new OrderServiceImpl(repository);

    @Test
    public void shouldFindAllOrders() {
        List<Order> expectedOrders = Collections.singletonList(TestOrders.regularOrder());
        when(repository.findAll()).thenReturn(expectedOrders);

        List<Order> ordersList = orderService.findAll();

        assertEquals(expectedOrders, ordersList);
    }

}