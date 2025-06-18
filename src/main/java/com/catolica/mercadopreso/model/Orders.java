package com.catolica.mercadopreso.model;

import jakarta.persistence.*; // Importa as anotações (os '@'), para interagir com o DB
import lombok.Data; // Lombok ajuda a diminuir a sintaxe do JAVA, não precisamos escrever getters nem setters

@Data
@Entity
public class Orders {

    @Id // Chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto increment da chave primária
    private Long id;
    // TODO add created at

    private String status;
    private Double total_value;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;
}
