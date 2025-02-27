package com.catolica.mercadopreso.controller;

import com.catolica.mercadopreso.model.Produto;
import com.catolica.mercadopreso.service.ProdutoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController  // Diz que essa classe é uma API REST
@RequestMapping("/produtos")  // Define a URL principal
public class ProdutoController {

    @Autowired  // Cria uma instancia chamada 'service' da classe 'ProdutoService'
    private ProdutoService service;

    @GetMapping  // Pra quando receber um GET na rota principal '/produtos'
    public List<Produto> listarTodos(){
        return service.listarTodos(); // Utiliza o métod'o da classe 'ProdutoService'
    }

    @GetMapping("/{id}")  // Pra quando receber um GET em '/produtos/{id}'
    public Optional<Produto> buscarPorId(@PathVariable Long id){  // @PathVariable diz que a variável que
        return service.buscarPorId(id);                           // a função recebe, vem da URL, nesse caso: {id}
    }

    @PostMapping  // Pra quando receber um POST em '/produto'
    public Produto criarProduto(@RequestBody Produto produto){  // @RequestBody diz que a instancia de 'Produto'
        return service.salvar(produto);                         // que esse métod'o recebe, vem do body da requisição
    }

    @DeleteMapping("/{id}")  // Pra quando receber um DELETE em '/produto/{id}'
    public void deletarProduto(@PathVariable Long id){
        service.deletar(id);
    }
}
