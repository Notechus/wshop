package com.notechus.wshop.infrastructure.repository;

import com.notechus.wshop.domain.entity.invoice.Invoice;
import com.notechus.wshop.domain.repository.InvoiceRepository;
import com.notechus.wshop.util.repository.AbstractDummyRepository;

import java.util.UUID;

/**
 * @author notechus.
 */
public class InvoiceRepositoryImpl extends AbstractDummyRepository<Invoice, UUID> implements InvoiceRepository {
}
