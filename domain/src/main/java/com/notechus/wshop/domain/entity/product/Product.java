package com.notechus.wshop.domain.entity.product;

import com.notechus.wshop.domain.entity.productproperties.ProductProperties;
import com.notechus.wshop.util.IEntity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public List<ProductProperties> getProperties() {
        return properties;
    }

    public void setProperties(List<ProductProperties> properties) {
        this.properties = properties;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id) &&
                Objects.equals(name, product.name) &&
                Objects.equals(details, product.details) &&
                Objects.equals(properties, product.properties) &&
                Objects.equals(category, product.category) &&
                Objects.equals(quantity, product.quantity) &&
                Objects.equals(price, product.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, details, properties, category, quantity, price);
    }
}
