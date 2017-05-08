package com.notechus.wshop.domain.entity.product;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;

/**
 * @author notechus.
 */
@Embeddable
public class Category {

    @Id
    private Long id;

    @Column(name = "NAME")
    private String name;

}
