package com.notechus.wshop.application.service.impl;

import com.notechus.wshop.application.service.InvoiceService;
import com.notechus.wshop.application.testobjects.TestInvoices;
import com.notechus.wshop.domain.entity.invoice.Invoice;
import com.notechus.wshop.domain.repository.InvoiceRepository;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

/**
 * @author notechus.
 */
public class InvoiceServiceImplTest {

    private InvoiceRepository repository = Mockito.mock(InvoiceRepository.class);

    private InvoiceService invoiceService = new InvoiceServiceImpl(repository);

    @Test
    public void shouldFindAllInvoices() {
        List<Invoice> expectedInvoices = Collections.singletonList(TestInvoices.regularInvoice());
        when(repository.findAll()).thenReturn(expectedInvoices);

        List<Invoice> invoiceList = invoiceService.findAll();

        assertEquals(expectedInvoices, invoiceList);
    }

}