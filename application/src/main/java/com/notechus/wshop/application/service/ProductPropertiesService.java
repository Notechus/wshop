package com.notechus.wshop.application.service;

import com.notechus.wshop.domain.entity.productproperties.ProductProperties;

import java.util.List;

/**
 * @author notechus.
 */
public interface ProductPropertiesService {

    List<ProductProperties> findAll();
}
