package com.catolica.mercadopreso.service;

import com.catolica.mercadopreso.model.Client;
import com.catolica.mercadopreso.model.Store;
import com.catolica.mercadopreso.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StoreService {

    @Autowired
    private StoreRepository repository;

    public List<Store> getAllStores(){
        return repository.findAll();
    }

    // ---- CRUD ----

    public Store createNewStore(Store store) {
        return repository.save(store);
    }

    public Optional<Store> getStoreById(Long id) {
        return repository.findById(id);
    }

    public Store updateStore(Store store) {
        return repository.save(store);
    }

    public void deleteStore(Long id) {
        repository.deleteById(id);
    }

}
