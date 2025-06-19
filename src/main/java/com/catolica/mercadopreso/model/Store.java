package com.catolica.mercadopreso.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Store {
    @Id // Chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto increment da chave primária
    private Long id;


    private String name;
    private String banner_image;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "client_id")
    private Client client;

    @OneToMany(mappedBy = "store")
    @JsonManagedReference
    private List<Product> products;
}
