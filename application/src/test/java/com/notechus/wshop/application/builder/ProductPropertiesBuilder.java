package com.notechus.wshop.application.builder;

import com.notechus.wshop.domain.entity.productproperties.ProductProperties;

/**
 * @author notechus.
 */
public class ProductPropertiesBuilder {

    private ProductProperties productProperties;

    public ProductPropertiesBuilder() {
        this.productProperties = new ProductProperties();
    }

    public ProductPropertiesBuilder withCode(String code) {
        this.productProperties.setCode(code);

        return this;
    }

    public ProductPropertiesBuilder withName(String name) {
        this.productProperties.setName(name);

        return this;
    }

    public ProductPropertiesBuilder withValue(String value) {
        this.productProperties.setValue(value);

        return this;
    }

    public ProductProperties build() {
        return this.productProperties;
    }
}
