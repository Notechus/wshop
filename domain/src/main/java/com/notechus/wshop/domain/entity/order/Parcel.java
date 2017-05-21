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

    @Column(name = "STATUS")
    private ParcelStatus status;

    @Column(name = "PARCEL_SIZE")
    private ParcelSize size;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ParcelStatus getStatus() {
        return status;
    }

    public void setStatus(ParcelStatus status) {
        this.status = status;
    }

    public ParcelSize getSize() {
        return size;
    }

    public void setSize(ParcelSize size) {
        this.size = size;
    }
}
