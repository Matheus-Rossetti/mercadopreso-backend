package com.catolica.mercadopreso.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*; // Importa as anotações (os '@'), para interagir com o DB
import lombok.Data; // Lombok ajuda a diminuir a sintaxe do JAVA, não precisamos escrever getters nem seters

import java.util.List;

@Data
@Entity // Indica que essa classe é uma tabela no DB
public class Product {
    @Id // Chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto increment da chave primária
    private Long id;
    private String name; // Campo de nome

    private Double price; // Campo de preço
    private String description;
    private Integer stock;
    private Integer amount_sold;
    private Long store_id;
    private Long category_id;
    private Double discount;

    private List<String> images;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "store_id")
    private Store store;
}
