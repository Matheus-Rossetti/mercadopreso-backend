package com.catolica.mercadopreso.controller;

import com.catolica.mercadopreso.model.CartItem;
import com.catolica.mercadopreso.service.CartItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/cart-item")
public class CartItemController {

    @Autowired
    private CartItemService service;

    // ---- CRUD ----

    @PostMapping()
    public CartItem createCartItem(@RequestBody CartItem cartItem) {
        return service.createNewCartItem(cartItem);
    }

    @GetMapping()
    public Optional<CartItem> readCartItem(@RequestParam Long id) {
        return service.getCartItemById(id);
    }

    @PutMapping()
    public CartItem updateCartItem(@RequestBody CartItem cartItem) {
        return service.updateCartItem(cartItem);
    }

    @DeleteMapping()
    public void deleteCartItem(@RequestParam Long id) {
        service.deleteCartItem(id);
    }
}
