package com.catolica.mercadopreso.repository;

import com.catolica.mercadopreso.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartInterface extends JpaRepository<Cart, Integer> {
}
