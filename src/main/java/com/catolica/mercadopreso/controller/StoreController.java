package com.catolica.mercadopreso.controller;

import com.catolica.mercadopreso.model.Client;
import com.catolica.mercadopreso.model.Store;
import com.catolica.mercadopreso.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/store")
public class StoreController {

    @Autowired
    private StoreService service;

    // ---- CRUD ----

    @PostMapping()
    public Store createClient(@RequestBody Store store) {
        return service.createNewClient(store);
    }

    @GetMapping()
    public Optional<Store> readClient(@RequestParam Long id) {
        return service.getClientById(id);
    }

    @PutMapping()
    public Store updateClient(@RequestBody Store store) {
        return service.updateStore(store);
    }

    @DeleteMapping()
    public void deleteStore(@RequestParam Long id) {
        service.deleteStore(id);
    }
}
