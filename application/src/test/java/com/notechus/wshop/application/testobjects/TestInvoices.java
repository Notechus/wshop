package com.notechus.wshop.application.testobjects;

import com.notechus.wshop.application.builder.InvoiceBuilder;
import com.notechus.wshop.domain.entity.invoice.Invoice;
import com.notechus.wshop.domain.entity.invoice.LineItem;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.UUID;

/**
 * @author notechus.
 */
public class TestInvoices {

    private static InvoiceBuilder builder = new InvoiceBuilder();

    public static Invoice regularInvoice() {
        return builder.withNumber(UUID.fromString("abcd-abcd-abcd-abcd-abcd"))
                .withLineItems(Arrays.asList(new LineItem(), new LineItem()))
                .withDate(LocalDateTime.of(2017, 10, 9, 10, 0))
                .withCustomerId(1)
                .build();
    }
}
