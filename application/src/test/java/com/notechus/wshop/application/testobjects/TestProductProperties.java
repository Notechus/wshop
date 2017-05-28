package com.notechus.wshop.application.testobjects;

import com.notechus.wshop.application.builder.ProductPropertiesBuilder;
import com.notechus.wshop.domain.entity.productproperties.ProductProperties;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author notechus.
 */
public class TestProductProperties {

    private static ProductPropertiesBuilder builder = new ProductPropertiesBuilder();

    public static ProductProperties screenProperty() {
        return builder.withId(1L).withName("Screen").withValue("4'").build();
    }

    public static ProductProperties ramProperty() {
        return builder.withId(2L).withName("RAM").withValue("2GB").build();
    }

    public static List<ProductProperties> regularProperties() {
        return Arrays.asList(screenProperty(), ramProperty());
    }

    public static List<Long> regularPropertiesIds() {
        return regularProperties().stream().map(ProductProperties::getId).collect(Collectors.toList());
    }
}
