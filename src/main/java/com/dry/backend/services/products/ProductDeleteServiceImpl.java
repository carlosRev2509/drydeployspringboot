package com.dry.backend.services.products;

import org.springframework.stereotype.Service;

import com.dry.backend.domain.products.Product;
import com.dry.backend.repository.products.ProductRepository;

/**
 * @author Bruno Ramirez
 **/
@Service
public class ProductDeleteServiceImpl implements ProductDeleteService {

    private ProductRepository productRepository;

    public ProductDeleteServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void deleteById(Long id) {
        Product product = productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product not found"));
        productRepository.delete(product);
    }
}
