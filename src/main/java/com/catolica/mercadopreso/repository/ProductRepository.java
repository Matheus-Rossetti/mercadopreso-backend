package com.catolica.mercadopreso.repository;

import com.catolica.mercadopreso.model.Product; // A classe/modelo/tabela 'Produto'
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}

// Uma interface é algo que define o que uma classe deve fazer, mas não como
// Nesse caso, não precisamos escrever nenhum métod'o na interface pois
// ela já estende de JpaRepository, que tem métodos de CRUD.

// Em suma, aqui a gente diz pro Spring que a classe/modelo/tabela vai ter CRUD
