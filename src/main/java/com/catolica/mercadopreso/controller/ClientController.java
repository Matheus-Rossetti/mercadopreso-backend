package com.catolica.mercadopreso.controller;

import com.catolica.mercadopreso.model.Client;
import com.catolica.mercadopreso.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientService service;

    @PostMapping("/create-user")
    public Client createClient(@RequestBody Client client) {
        return service.createNewClient(client);
    }

    @PostMapping("/login")
    public Long loginClient(@RequestBody Client client) {
       return service.authClient(client.getName(), client.getPassword());
    }

    @GetMapping
    public Client getClientById(@RequestParam Long id) {
        return service.getClientById(id);
    }




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
}