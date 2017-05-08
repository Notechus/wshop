package com.notechus.wshop.infrastructure.service;

import com.notechus.wshop.domain.entity.customer.Customer;

/**
 * @author notechus.
 */
public interface MailService {

    void sendMail(Customer c, String msg);
}
