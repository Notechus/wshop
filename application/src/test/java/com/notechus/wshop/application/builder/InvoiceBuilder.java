package com.notechus.wshop.application.builder;

import com.notechus.wshop.domain.entity.invoice.Invoice;
import com.notechus.wshop.domain.entity.invoice.LineItem;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

/**
 * @author notechus.
 */
public class InvoiceBuilder {

    private Invoice invoice;

    public InvoiceBuilder() {
        this.invoice = new Invoice();
    }

    public InvoiceBuilder withNumber(UUID number) {
        this.invoice.setId(number);

        return this;
    }

    public InvoiceBuilder withDate(LocalDateTime date) {
        this.invoice.setDate(date);

        return this;
    }

    public InvoiceBuilder withLineItems(List<LineItem> lineItems) {
        this.invoice.setLineItems(lineItems);

        return this;
    }

    public InvoiceBuilder withCustomerId(int id) {
        this.invoice.setCustomerId(id);

        return this;
    }

    public Invoice build() {
        return this.invoice;
    }

}
