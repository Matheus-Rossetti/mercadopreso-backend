package com.catolica.mercadopreso.controller;

import com.catolica.mercadopreso.model.Client;
import com.catolica.mercadopreso.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientService service;

    // ---- AUTH ----

    @PostMapping("/login")
    public Long loginClient(@RequestBody Client client) {
        return service.authClient(client.getName(), client.getPassword());
    }

    // ---- CRUD ----

    @PostMapping()
    public Client createClient(@RequestBody Client client) {
        return service.createNewClient(client);
    }

    @GetMapping()
    public Optional<Client> readClient(@RequestParam Long id) {
        return service.getClientById(id);
    }

    @PutMapping()
    public Client updateClient(@RequestBody Client client) {
        return service.updateClient(client);
    }

    @DeleteMapping()
    public void deleteClient(@RequestParam Long id) {
        service.deleteClient(id);
    }
}