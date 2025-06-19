package com.catolica.mercadopreso.service;

import com.catolica.mercadopreso.model.CartItem;
import com.catolica.mercadopreso.repository.CartItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CartItemService {

    @Autowired
    private CartItemRepository repository;

    // ---- CRUD ----

    public CartItem createNewCartItem(CartItem cartItem) {
        return repository.save(cartItem);
    }

    public Optional<CartItem> getCartItemById(Long id) {
        return repository.findById(id);
    }

    public CartItem updateCartItem(CartItem cartItem) {
        return repository.save(cartItem);
    }

    public void deleteCartItem(Long id) {
        repository.deleteById(id);
    }
}
