package com.notechus.wshop.domain.repository;

import com.notechus.wshop.domain.entity.invoice.Invoice;
import com.notechus.wshop.util.repository.Repository;

import java.util.UUID;

/**
 * @author notechus.
 */
public interface InvoiceRepository extends Repository<Invoice, UUID> {
}
