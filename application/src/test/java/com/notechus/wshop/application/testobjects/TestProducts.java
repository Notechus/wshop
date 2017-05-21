package com.notechus.wshop.application.testobjects;

import com.notechus.wshop.application.builder.ProductBuilder;
import com.notechus.wshop.domain.entity.product.Category;
import com.notechus.wshop.domain.entity.product.Product;

import java.math.BigDecimal;

/**
 * @author notechus.
 */
public class TestProducts {

    private static ProductBuilder builder = new ProductBuilder();

    public static Product regularProduct() {
        return builder.withId(1L).withName("some product")
                .withDetails("product details")
                .withCategory(new Category())
                .withPrice(BigDecimal.ONE)
                .withProperties(TestProductProperties.regularProperties())
                .withQuantity(1L).build();
    }
}
