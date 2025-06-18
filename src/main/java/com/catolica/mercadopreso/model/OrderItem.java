package com.catolica.mercadopreso.model;

import jakarta.persistence.*; // Importa as anotações (os '@'), para interagir com o DB
import lombok.Data; // Lombok ajuda a diminuir a sintaxe do JAVA, não precisamos escrever getters nem setters

@Data
@Entity
public class OrderItem {
    @Id // Chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto increment da chave primária
    private Long id;


    private Integer order_id;
    private Integer product_id;
    private Integer quantity;
    private Double price_at_sale_time;
}
