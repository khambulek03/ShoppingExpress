package com.shoppingxpress.ProductService.service;

import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public ProductResponseDTO getProduct(UUID id) {
        return new ProductResponseDTO();
    }
}