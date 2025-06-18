package com.catolica.mercadopreso.model;

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
    private String address;
    private Double amount_spent;

    @OneToMany(mappedBy = "client")
    private List<Store> stores;

    @OneToMany(mappedBy = "client")
    private List<Orders> orders;

    @OneToOne(mappedBy = "client")
    private Cart cart;
}
