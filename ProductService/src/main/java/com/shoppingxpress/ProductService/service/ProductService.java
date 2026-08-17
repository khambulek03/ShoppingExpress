package com.shoppingxpress.ProductService.service;

import org.springframework.stereotype.Service;

import com.shoppingxpress.ProductService.repository.*;
import com.shoppingxpress.ProductService.dto.*;

import java.util.*;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public ProductResponseDTO getProduct(UUID id) {
        return new ProductResponseDTO();
    }

    public Page<ProductResponseDTO> getProducts(int page, int size, String sort) {
        return null;
    }
}