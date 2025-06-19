package com.catolica.mercadopreso.controller;

import com.catolica.mercadopreso.model.Product;
import com.catolica.mercadopreso.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService service;

    // ---- CRUD ----

    @PostMapping()
    public Product createProduct(@RequestBody Product product) {
        return service.createNewProduct(product);
    }

    @GetMapping()
    public Optional<Product> readProduct(@RequestParam Long id) {
        return service.getProductById(id);
    }

    @PutMapping()
    public Product updateProduct(@RequestBody Product product) {
        return service.updateProduct(product);
    }

    @DeleteMapping()
    public void deleteProduct(@RequestParam Long id) {
        service.deleteProduct(id);
    }
}