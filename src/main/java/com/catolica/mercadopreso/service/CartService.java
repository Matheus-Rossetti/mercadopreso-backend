package com.catolica.mercadopreso.service;

import com.catolica.mercadopreso.model.Cart;
import com.catolica.mercadopreso.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CartService {

    @Autowired
    private CartRepository repository;

    // ---- CRUD ----

    public Cart createNewCart(Cart cart) {
        return repository.save(cart);
    }

    public Optional<Cart> getCartById(Long id) {
        return repository.findById(id);
    }

    public Cart updateCart(Cart cart) {
        return repository.save(cart);
    }

    public void deleteCart(Long id) {
        repository.deleteById(id);
    }
}
