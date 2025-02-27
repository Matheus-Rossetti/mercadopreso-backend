package com.catolica.mercadopreso.service;

import com.catolica.mercadopreso.model.Produto;
import com.catolica.mercadopreso.repository.ProdutoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List; // Sim, tem que importar 'List', bizarro
import java.util.Optional;  // 'Optional' é um tipo de retorno que pode, ou não, ser nulo


@Service  // Diz que essa classe contém a lógica de negócio
public class ProdutoService {

    @Autowired  // Já cria um objeto da interface 'ProdutoRepository', não precisa fazer manualmente
    private ProdutoRepository repository;

    public List<Produto> listarTodos(){  // Retorna uma lista com todos os produtos
        return repository.findAll();
    }

    public Optional<Produto> buscarPorId(Long id){  // Recebe o Id e retorno o produto
        return repository.findById(id);
    }

    public Produto salvar(Produto produto){  // Recebe um objeto do tipo 'Produto' e salva ele no DB
        return repository.save(produto);
    }

    public void deletar(Long id) {  // Recebe o Id e deleta o coitado
        repository.deleteById(id);
    }
}
