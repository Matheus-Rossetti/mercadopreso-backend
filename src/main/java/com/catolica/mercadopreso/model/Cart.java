package com.catolica.mercadopreso.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Cart {
    @Id // Chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto increment da chave primária
    private Long id;

    @OneToMany(mappedBy = "cart")
    private List<CartItem> cartItems;

    @OneToOne
    @JoinColumn(name = "client_id", unique = true)
    private Client client;
}
