package com.notechus.wshop.infrastructure.service;

import com.notechus.wshop.domain.entity.order.Order;
import com.notechus.wshop.domain.entity.order.Parcel;

/**
 * @author notechus.
 */
public interface ParcelService {

    Parcel getParcel(Long id);

    void createParcel(Order o);

    void cancelParcel(Long id);
}
