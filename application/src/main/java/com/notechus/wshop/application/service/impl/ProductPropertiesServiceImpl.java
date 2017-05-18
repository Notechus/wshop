package com.notechus.wshop.application.service.impl;

import com.google.inject.Inject;
import com.notechus.wshop.application.service.ProductPropertiesService;
import com.notechus.wshop.domain.entity.productproperties.ProductProperties;
import com.notechus.wshop.domain.repository.ProductPropertiesRepository;

import java.util.List;

/**
 * @author notechus.
 */
public class ProductPropertiesServiceImpl implements ProductPropertiesService {

    private ProductPropertiesRepository productPropertiesRepository;

    @Inject
    public ProductPropertiesServiceImpl(ProductPropertiesRepository repository) {
        this.productPropertiesRepository = repository;
    }


    @Override
    public List<ProductProperties> findAll() {
        return productPropertiesRepository.findAll();
    }
}
