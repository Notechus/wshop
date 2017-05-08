package com.notechus.wshop.domain.entity.order;

import com.notechus.wshop.domain.type.ParcelStatus;
import com.notechus.wshop.util.type.ParcelSize;

import javax.persistence.*;

/**
 * @author notechus.
 */
@Entity
@Table(name = "PARCEL")
public class Parcel {

    @Id
    private Long id;

    @OneToOne
    @JoinColumn(name = "ORDER_ID")
    private Order order;

    @Column(name = "STATUS")
    private ParcelStatus status;

    @Column(name = "PARCEL_SIZE")
    private ParcelSize size;

    //TODO FIXME: add parcel size


/*
 * REST client w infrastructure
 */
}
