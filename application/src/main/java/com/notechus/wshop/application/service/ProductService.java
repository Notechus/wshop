package com.notechus.wshop.application.service;

import com.notechus.wshop.domain.criteria.ProductCriteria;
import com.notechus.wshop.domain.entity.product.Category;
import com.notechus.wshop.domain.entity.product.Product;

import java.util.List;

/**
 * @author notechus.
 */
public interface ProductService {

    Product getProduct(Long id);

    List<Product> getProducts(ProductCriteria productCriteria);

    List<Product> getProductsByCategory(Category category);

    List<Product> findAll();

    //TODO FIXME: add, del, update
}
