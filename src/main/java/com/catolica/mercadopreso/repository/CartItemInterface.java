package com.catolica.mercadopreso.repository;

import com.catolica.mercadopreso.model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartItemInterface extends JpaRepository<CartItem, Integer> {
}
