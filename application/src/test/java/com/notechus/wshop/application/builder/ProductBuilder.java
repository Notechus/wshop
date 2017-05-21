package com.notechus.wshop.application.builder;

import com.notechus.wshop.domain.entity.product.Category;
import com.notechus.wshop.domain.entity.product.Product;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author notechus.
 */
public class ProductBuilder {

    private Product product;

    public ProductBuilder() {
        this.product = new Product();
    }

    public ProductBuilder withId(Long id) {
        this.product.setId(id);

        return this;
    }

    public ProductBuilder withName(String name) {
        this.product.setName(name);

        return this;
    }

    public ProductBuilder withDetails(String details) {
        this.product.setDetails(details);

        return this;
    }

    public ProductBuilder withProperties(List<String> productProperties) {
        this.product.setProperties(productProperties);

        return this;
    }

    public ProductBuilder withCategory(Category category) {
        this.product.setCategory(category);

        return this;
    }

    public ProductBuilder withQuantity(Long quantity) {
        this.product.setQuantity(quantity);

        return this;
    }

    public ProductBuilder withPrice(BigDecimal price) {
        this.product.setPrice(price);

        return this;
    }

    public Product build() {
        return this.product;
    }

}
