package com.notechus.wshop.infrastructure.repository.dummy;

import com.notechus.wshop.domain.entity.order.Order;
import com.notechus.wshop.domain.repository.OrderRepository;
import com.notechus.wshop.util.repository.AbstractDummyRepository;

/**
 * @author notechus.
 */
public class OrderRepositoryDummyImpl extends AbstractDummyRepository<Order, Long> implements OrderRepository {
}
