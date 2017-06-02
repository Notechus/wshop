package com.notechus.wshop.infrastructure.repository.dummy;

import com.notechus.wshop.domain.entity.product.Product;
import com.notechus.wshop.domain.repository.ProductRepository;
import com.notechus.wshop.util.repository.AbstractDummyRepository;

/**
 * @author notechus.
 */
public class ProductRepositoryDummmyImpl extends AbstractDummyRepository<Product, Long> implements ProductRepository {
}
