package com.catolica.mercadopreso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Classe inicial do JAVA/Spring, só inicia o projeto
// Em JAVA, cada arquivo é uma classe, só pode uma classe por arquivo

@SpringBootApplication  // Marcador que diz que essa classe inicia o Spring
public class MercadoPresoApplication {
    public static void main(String[] args) {
        SpringApplication.run(MercadoPresoApplication.class, args);
    }
}
