package com.notechus.wshop.domain.entity.order;

import javax.persistence.*;

/**
 * @author notechus.
 */
@Entity
@SequenceGenerator(sequenceName = "ORDERITEM_SEQ", name = "ORDERITEM_SEQ")
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ORDERITEM_SEQ")
    private Long id;

    private Long orderId;

    private Long productId;

    private int quantity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
