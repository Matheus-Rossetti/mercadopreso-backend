package com.catolica.mercadopreso.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Store {
    @Id // Chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto increment da chave primária
    private Long id;


    private String name;
    private String banner_image;
    private Integer owner_id;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;
}
