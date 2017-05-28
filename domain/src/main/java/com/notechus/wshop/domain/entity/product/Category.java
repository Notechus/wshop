package com.notechus.wshop.domain.entity.product;

import javax.persistence.*;

/**
 * @author notechus.
 */
@Embeddable
@SequenceGenerator(name = "CATEGORY_SEQ", sequenceName = "CATEGORY_SEQ")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CATEGORY_SEQ")
    private Long id;

    @Column(name = "NAME")
    private String name;

}
