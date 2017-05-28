package com.notechus.wshop.domain.entity.invoice;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author notechus.
 */
@Entity
@Table(name = "LINE_ITEM")
@SequenceGenerator(sequenceName = "LINEITEM_SEQ", name = "LINEITEM_SEQ")
public class LineItem {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LINEITEM_SEQ")
    private Long id;

    private Long invoiceId;

    @Column(name = "PRODUCT_ID")
    private int productId;

    @Column(name = "QUANTITY")
    private int quantity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Long invoiceId) {
        this.invoiceId = invoiceId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LineItem)) return false;
        LineItem lineItem = (LineItem) o;
        return productId == lineItem.productId &&
                quantity == lineItem.quantity &&
                Objects.equals(id, lineItem.id) &&
                Objects.equals(invoiceId, lineItem.invoiceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, invoiceId, productId, quantity);
    }
}
