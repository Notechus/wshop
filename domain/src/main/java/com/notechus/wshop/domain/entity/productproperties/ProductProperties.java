package com.notechus.wshop.domain.entity.productproperties;

import com.notechus.wshop.util.IEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Aggregate root
 *
 * @author notechus.
 */
@Entity
@Table(name = "PRODUCT_PROPERTIES")
public class ProductProperties implements IEntity<String> {

    @Id
    @Column(name = "CODE")
    private String code;

    @Column(name = "NAME")
    private String name;

    @Column(name = "VALUE")
    private String value;

    @Override
    public String getId() {
        return code;
    }

    @Override
    public void setId(String id) {
        this.code = id;
    }
}
