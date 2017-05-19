package com.notechus.wshop.domain.entity.order;

import com.notechus.wshop.util.IEntity;
import com.notechus.wshop.domain.entity.customer.Customer;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

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

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public BigDecimal getShippingPrice() {
        return shippingPrice;
    }

    public void setShippingPrice(BigDecimal shippingPrice) {
        this.shippingPrice = shippingPrice;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public Parcel getParcel() {
        return parcel;
    }

    public void setParcel(Parcel parcel) {
        this.parcel = parcel;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id) &&
                Objects.equals(totalPrice, order.totalPrice) &&
                Objects.equals(shippingPrice, order.shippingPrice) &&
                Objects.equals(customer, order.customer) &&
                Objects.equals(orderItems, order.orderItems) &&
                Objects.equals(parcel, order.parcel) &&
                Objects.equals(orderDate, order.orderDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, totalPrice, shippingPrice, customer, orderItems, parcel, orderDate);
    }
}
