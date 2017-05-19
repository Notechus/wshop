package com.notechus.wshop.domain.entity.invoice;

import com.notechus.wshop.util.IEntity;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/**
 * Aggregate root
 *
 * @author notechus.
 */
@Entity
@Table(name = "INVOICE")
public class Invoice implements IEntity<UUID> {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID",
            strategy = "org.hibernate.number.UUIDGenerator",
            parameters = {
                    @Parameter(
                            name = "uuid_gen_strategy_class",
                            value = "org.hibernate.number.uuid.CustomVersionOneStrategy"
                    )
            })
    @Column(name = "ID")
    private UUID number;

    @Column(name = "DATE_TIME", nullable = false)
    private LocalDateTime date;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn
    private List<LineItem> lineItems;

    @Column(name = "CUSTOMER_ID")
    private int customerId;

    @Override
    public UUID getId() {
        return number;
    }

    @Override
    public void setId(UUID uuid) {
        this.number = uuid;
    }

    public UUID getNumber() {
        return number;
    }

    public void setNumber(UUID number) {
        this.number = number;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public void setLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Invoice)) return false;
        Invoice invoice = (Invoice) o;
        return customerId == invoice.customerId &&
                Objects.equals(number, invoice.number) &&
                Objects.equals(date, invoice.date) &&
                Objects.equals(lineItems, invoice.lineItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, date, lineItems, customerId);
    }
}
