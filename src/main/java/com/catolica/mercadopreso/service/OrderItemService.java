package com.catolica.mercadopreso.service;

import com.catolica.mercadopreso.model.OrderItem;
import com.catolica.mercadopreso.repository.OrderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderItemService {

    @Autowired
    private OrderItemRepository repository;

    // ---- CRUD ----

    public OrderItem createNewOrderItem(OrderItem orderItem) {
        return repository.save(orderItem);
    }

    public Optional<OrderItem> getOrderItemById(Long id) {
        return repository.findById(id);
    }

    public OrderItem updateOrderItem(OrderItem orderItem) {
        return repository.save(orderItem);
    }

    public void deleteOrderItem(Long id) {
        repository.deleteById(id);
    }
}


