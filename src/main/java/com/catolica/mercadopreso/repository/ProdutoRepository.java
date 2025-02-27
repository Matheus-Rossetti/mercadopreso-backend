package com.catolica.mercadopreso.repository;

import com.catolica.mercadopreso.model.Produto; // A classe/modelo/tabela 'Produto'

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Marca essa interface como um repo JPA
            // 'JPA' é um dos ORM do Spring
            // ORMs servem para se comunicar com DBs direto pelo código
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}

// Uma interface é algo que define o que uma classe deve fazer, mas não como
// Nesse caso, não precisamos escrever nenhum métod'o na interface pois
// ela já estende de JpaRepository, que tem métodos de CRUD.

// Em suma, aqui a gente diz pro Spring que a classe/modelo/tabela vai ter CRUD
