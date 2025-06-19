package com.catolica.mercadopreso.controller;

import com.catolica.mercadopreso.model.OrderItem;
import com.catolica.mercadopreso.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/order-item")
public class OrderItemController {

    @Autowired
    private OrderItemService service;

    // ---- CRUD ----

    @PostMapping()
    public OrderItem createOrderItem(@RequestBody OrderItem orderItem) {
        return service.createNewOrderItem(orderItem);
    }

    @GetMapping()
    public Optional<OrderItem> readOrderItem(@RequestParam Long id) {
        return service.getOrderItemById(id);
    }

    @PutMapping()
    public OrderItem updateOrderItem(@RequestBody OrderItem orderItem) {
        return service.updateOrderItem(orderItem);
    }

    @DeleteMapping()
    public void deleteOrderItem(@RequestParam Long id) {
        service.deleteOrderItem(id);
    }
}