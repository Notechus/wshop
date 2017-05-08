package com.notechus.wshop.domain.entity.product;

import com.notechus.wshop.domain.entity.productproperties.ProductProperties;
import com.notechus.wshop.util.IEntity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author notechus.
 */
@Entity
@Table(name = "PRODUCT")
public class Product implements IEntity<Long> {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DETAILS")
    private String details;

    @ManyToMany
    @JoinTable(name = "PROPERTIES_TO_PRODUCT",
            joinColumns = {@JoinColumn(name = "PRODUCT_ID")},
            inverseJoinColumns = {@JoinColumn(name = "CODE_ID")})
    private List<ProductProperties> properties; //TODO FIXME: list of IDs

    @ManyToOne
    @JoinColumn(name = "CATEGORY_ID")
    @Embedded
    private Category category;

    @Column(name = "QUANTITY")
    private Long quantity;

    @Column(name = "PRICE")
    private BigDecimal price;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long aLong) {
        this.id = aLong;
    }
}
