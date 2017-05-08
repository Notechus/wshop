package com.notechus.wshop.application.service;

import com.notechus.wshop.domain.entity.customer.Customer;
import com.notechus.wshop.domain.entity.invoice.Invoice;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author notechus.
 */
public interface InvoiceService {

    Invoice getInvoice(Long id);

    List<Invoice> getInvoicesForCustomer(Customer customer);

    List<Invoice> getInvoicesForClientAndDateInRange(Customer customer, LocalDateTime minDate, LocalDateTime maxDate);

    Invoice createInvoice(Long orderId, Long customerId, BigDecimal cash);

    List<Invoice> findAll();
}
