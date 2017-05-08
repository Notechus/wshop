package com.notechus.wshop.domain.entity.order;

import com.notechus.wshop.domain.entity.product.Product;

import javax.persistence.Entity;

/**
 * @author notechus.
 */
@Entity
public class OrderItem {

    private Product product;

    private int quentity;

}
