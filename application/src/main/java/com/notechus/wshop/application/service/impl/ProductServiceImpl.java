package com.notechus.wshop.application.service.impl;

import com.google.inject.Inject;
import com.notechus.wshop.application.service.ProductService;
import com.notechus.wshop.domain.criteria.ProductCriteria;
import com.notechus.wshop.domain.entity.product.Category;
import com.notechus.wshop.domain.entity.product.Product;
import com.notechus.wshop.domain.repository.ProductRepository;

import java.util.List;

/**
 * @author notechus.
 */
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    @Inject
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product getProduct(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public List<Product> getProducts(ProductCriteria productCriteria) {
        return null;
    }

    @Override
    public List<Product> getProductsByCategory(Category category) {
        return null;
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }
}
