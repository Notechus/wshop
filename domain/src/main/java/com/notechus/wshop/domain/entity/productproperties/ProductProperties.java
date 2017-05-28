package com.notechus.wshop.domain.entity.productproperties;

import com.notechus.wshop.util.IEntity;

import javax.persistence.*;
import java.util.Objects;

/**
 * Aggregate root
 *
 * @author notechus.
 */
@Entity
@Table(name = "PRODUCT_PROPERTIES")
public class ProductProperties implements IEntity<Long> {

    @Id
    @GeneratedValue()
    @Column(name = "CODE")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "VALUE")
    private String value;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductProperties)) return false;
        ProductProperties that = (ProductProperties) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, value);
    }
}
