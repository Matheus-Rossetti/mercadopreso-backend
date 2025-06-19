package com.catolica.mercadopreso.service;

import com.catolica.mercadopreso.model.Orders;
import com.catolica.mercadopreso.repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrdersService {

    @Autowired
    private OrdersRepository repository;

    // ---- CRUD ----

    public Orders createNewOrders(Orders orders) {
        return repository.save(orders);
    }

    public Optional<Orders> getOrdersById(Long id) {
        return repository.findById(id);
    }

    public Orders updateOrders(Orders orders) {
        return repository.save(orders);
    }

    public void deleteOrders(Long id) {
        repository.deleteById(id);
    }
}
