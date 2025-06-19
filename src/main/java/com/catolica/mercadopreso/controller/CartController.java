package com.catolica.mercadopreso.controller;

import com.catolica.mercadopreso.model.Cart;
import com.catolica.mercadopreso.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartService service;

    // ---- CRUD ----

    @PostMapping()
    public Cart createCart(@RequestBody Cart cart) {
        return service.createNewCart(cart);
    }

    @GetMapping()
    public Optional<Cart> readCart(@RequestParam Long id) {
        return service.getCartById(id);
    }

    @PutMapping()
    public Cart updateCart(@RequestBody Cart cart) {
        return service.updateCart(cart);
    }

    @DeleteMapping()
    public void deleteCart(@RequestParam Long id) {
        service.deleteCart(id);
    }
}
