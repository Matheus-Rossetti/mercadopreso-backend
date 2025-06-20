package com.catolica.mercadopreso.controller;

import com.catolica.mercadopreso.model.Product;
import com.catolica.mercadopreso.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping("/best-sellers")
    public List<Product> getBestSellers(){
        return service.getBestSellers();
    }

    @GetMapping("/latest")
    public List<Product> getLatestProducts(){
        return service.getLatestProducts();
    }

    @GetMapping("/all")
    public List<Product> getAllProducts(){
        return service.getAllProducts();
    }

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