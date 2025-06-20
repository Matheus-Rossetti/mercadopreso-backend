package com.catolica.mercadopreso.repository;

import com.catolica.mercadopreso.model.Product; // A classe/modelo/tabela 'Produto'
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}