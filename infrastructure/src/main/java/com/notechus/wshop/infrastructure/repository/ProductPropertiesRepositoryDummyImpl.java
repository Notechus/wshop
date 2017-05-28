package com.notechus.wshop.infrastructure.repository;

import com.notechus.wshop.domain.entity.productproperties.ProductProperties;
import com.notechus.wshop.domain.repository.ProductPropertiesRepository;
import com.notechus.wshop.util.repository.AbstractDummyRepository;

/**
 * @author notechus.
 */
public class ProductPropertiesRepositoryDummyImpl extends AbstractDummyRepository<ProductProperties, Long> implements ProductPropertiesRepository {
}
