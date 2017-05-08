package com.notechus.wshop.domain.entity.invoice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author notechus.
 */
@Entity
@Table(name = "LINE_ITEM")
public class LineItem {

    private Long id;

    @Column(name = "PRODUCT_ID")
    private int productId;

    @Column(name = "QUANTITY")
    private int quantity;
}
