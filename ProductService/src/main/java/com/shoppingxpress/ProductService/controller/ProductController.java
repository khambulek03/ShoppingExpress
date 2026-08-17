package com.shoppingxpress.ProductService.controller;

@RestController
@RequestMapping(path="/api/shop")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public Page<ProductResponseDTO> getAllProducts() {
        return productService.getProducts();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getProductById(@PathVariable UUID id) {
        var product = productService.getProductById(id);
        return product != null ? ResponseEntity.ok(product)
                : ResponseEntity.status(HttpStatus.NOT_FOUND).build();
}

}