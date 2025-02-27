package com.catolica.mercadopreso.model;


import jakarta.persistence.*; // Importa as anotações (os '@'), para interagir com o DB
import lombok.Data; // Lombok ajuda a diminuir a sintaxe do JAVA, não precisamos escrever getters nem setters

@Data
@Entity // Indica que essa classe é uma tabela no DB
public class Produto {
    @Id // Chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto increment da chave primária

    private Long id; // Campo de id, 'Long' é um int muito grande, ex: 99999999999999

    private String nome; // Campo de nome
    private Double preco; // Campo de preço
}
