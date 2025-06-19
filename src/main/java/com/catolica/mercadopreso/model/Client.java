package com.catolica.mercadopreso.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*; // Importa as anotações (os '@'), para interagir com o DB
import lombok.Data; // Lombok ajuda a diminuir a sintaxe do JAVA, não precisamos escrever getters nem setters

import java.util.List;

@Data
@Entity
public class Client {

    @Id // Chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto increment da chave primária
    private Long id;

    private String name; // Campo de nome
    private String password;
    private Double amount_spent;

    @OneToMany(mappedBy = "client")
    @JsonManagedReference
    private List<Store> stores;

    @OneToMany(mappedBy = "client")
    @JsonManagedReference
    private List<Orders> orders;

    @OneToOne(mappedBy = "client")
    @JsonManagedReference
    private Cart cart;
}
