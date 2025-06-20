package com.catolica.mercadopreso.service;

import com.catolica.mercadopreso.model.Product;
import com.catolica.mercadopreso.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> getBestSellers(){
        return repository.findAll().stream()
                .sorted(Comparator.comparing(Product::getAmount_sold).reversed())
                .collect(Collectors.toList());
    }

    public List<Product> getLatestProducts(){
        return repository.findAll().stream()
                .sorted(Comparator.comparing(Product::getId).reversed())
                .collect(Collectors.toList());
    }

    public List<Product> getAllProducts(){
        return repository.findAll();
    }

    // ---- CRUD ----

    public Product createNewProduct(Product product) {
        return repository.save(product);
    }

    public Optional<Product> getProductById(Long id) {
        return repository.findById(id);
    }

    public Product updateProduct(Product product) {
        return repository.save(product);
    }

    public void deleteProduct(Long id) {
        repository.deleteById(id);
    }
}
