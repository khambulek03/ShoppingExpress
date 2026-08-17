package com.shoppingxpress.ProductService.service;

import org.springframework.stereotype.Service;

import com.shoppingxpress.ProductService.repository.*;

import java.util.*;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public ProductResponseDTO getProduct(UUID id) {
        return new ProductResponseDTO();
    }
}