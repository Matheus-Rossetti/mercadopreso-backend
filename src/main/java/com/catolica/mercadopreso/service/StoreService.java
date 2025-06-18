package com.catolica.mercadopreso.service;

import com.catolica.mercadopreso.model.Store;
import com.catolica.mercadopreso.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoreService {

    @Autowired
    private StoreRepository repository;

    public Store createNewStore(Store store) {
        return repository.save(store);
    }



}
