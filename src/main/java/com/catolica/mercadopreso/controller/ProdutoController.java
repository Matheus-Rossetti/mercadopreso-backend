//package com.catolica.mercadopreso.controller;
//
//import com.catolica.mercadopreso.model.Product;
//import com.catolica.mercadopreso.service.ProductService;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController  // Diz que essa classe recebe req REST
//@RequestMapping("/produtos")  // Define a URL principal
//public class ProdutoController {
//
//    @Autowired  // Cria uma instancia chamada 'service' da classe 'ProdutoService'
//    private ProductService service;
//
//    @GetMapping
//    public List<Product> listarTodos(){
//        return service.listarTodos(); // Utiliza o métod'o da classe 'ProdutoService'
//    }
//
//    @GetMapping("/{id}")
//    public Optional<Product> buscarPorId(@PathVariable Long id){  // @PathVariable diz que a variável que
//        return service.buscarPorId(id);                           // a função recebe, vem da URL, nesse caso: {id}
//    }
//
//    @PostMapping
//    public Product criarProduto(@RequestBody Product product){  // @RequestBody diz que a instancia de 'Produto'
//        return service.salvar(product);                         // que esse métod'o recebe, vem do body da requisição
//    }
//
//    @DeleteMapping("/{id}")
//    public void deletarProduto(@PathVariable Long id){
//        service.deletar(id);
//    }
//}
