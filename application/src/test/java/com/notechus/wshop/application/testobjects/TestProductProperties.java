package com.notechus.wshop.application.testobjects;

import com.notechus.wshop.application.builder.ProductPropertiesBuilder;
import com.notechus.wshop.domain.entity.productproperties.ProductProperties;

import java.util.Arrays;
import java.util.List;

/**
 * @author notechus.
 */
public class TestProductProperties {

    private static ProductPropertiesBuilder builder = new ProductPropertiesBuilder();

    public static ProductProperties screenProperty() {
        return builder.withCode("1X").withName("Screen").withValue("4'").build();
    }

    public static ProductProperties ramProperty() {
        return builder.withCode("2X").withName("RAM").withValue("2GB").build();
    }

    public static List<ProductProperties> regularProperties() {
        return Arrays.asList(screenProperty(), ramProperty());
    }
}
