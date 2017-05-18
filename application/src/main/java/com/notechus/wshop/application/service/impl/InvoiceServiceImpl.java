package com.notechus.wshop.application.service.impl;

import com.notechus.wshop.application.service.InvoiceService;
import com.notechus.wshop.domain.entity.customer.Customer;
import com.notechus.wshop.domain.entity.invoice.Invoice;
import com.notechus.wshop.domain.repository.InvoiceRepository;

import javax.inject.Inject;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author notechus.
 */
public class InvoiceServiceImpl implements InvoiceService {

    private InvoiceRepository invoiceRepository;

    @Inject
    public InvoiceServiceImpl(InvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    @Override
    public Invoice getInvoice(Long id) {
        return null;
    }

    @Override
    public List<Invoice> getInvoicesForCustomer(Customer customer) {
        return null;
    }

    @Override
    public List<Invoice> getInvoicesForClientAndDateInRange(Customer customer, LocalDateTime minDate, LocalDateTime maxDate) {
        return null;
    }

    @Override
    public Invoice createInvoice(Long orderId, Long customerId, BigDecimal cash) {
        return null;
    }

    @Override
    public List<Invoice> findAll() {
        return invoiceRepository.findAll();
        // convert data
    }
}
