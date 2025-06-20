package com.catolica.mercadopreso.controller;

import com.catolica.mercadopreso.model.Client;
import com.catolica.mercadopreso.model.Store;
import com.catolica.mercadopreso.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/store")
public class StoreController {

    @Autowired
    private StoreService service;

    @GetMapping("/all")
    public List<Store> getAllStores(){
        return service.getAllStores();
    }

    // ---- CRUD ----

    @PostMapping()
    public Store createStore(@RequestBody Store store) {
        return service.createNewStore(store);
    }

    @GetMapping()
    public Optional<Store> readStore(@RequestParam Long id) {
        return service.getStoreById(id);
    }

    @PutMapping()
    public Store updateStore(@RequestBody Store store) {
        return service.updateStore(store);
    }

    @DeleteMapping()
    public void deleteStore(@RequestParam Long id) {
        service.deleteStore(id);
    }
}
