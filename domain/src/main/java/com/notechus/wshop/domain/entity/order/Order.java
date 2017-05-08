package com.notechus.wshop.domain.entity.order;

import com.notechus.wshop.util.IEntity;
import com.notechus.wshop.domain.entity.customer.Customer;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Aggregate root
 *
 * @author notechus.
 */
@Entity
@Table(name = "ORDER")
public class Order implements IEntity<Long> {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "TOTAL_PRICE")
    private BigDecimal totalPrice;

    @Column(name = "SHIPPING_PRICE")
    private BigDecimal shippingPrice;

    @ManyToOne
    @JoinColumn(name = "CUSTOMER_ID")
    private Customer customer;

    private List<OrderItem> orderItems;

    @OneToOne
    @JoinColumn(name = "PARCEL_ID")
    private Parcel parcel;

    @Column(name = "ORDER_DATE")
    private LocalDateTime orderDate;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long aLong) {
        this.id = id;
    }
}
