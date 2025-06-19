package com.catolica.mercadopreso.controller;

import com.catolica.mercadopreso.model.Orders;
import com.catolica.mercadopreso.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/order")
public class OrdersController {

    @Autowired
    private OrdersService service;

    // ---- CRUD ----

    @PostMapping()
    public Orders createOrders(@RequestBody Orders orders) {
        return service.createNewOrders(orders);
    }

    @GetMapping()
    public Optional<Orders> readOrders(@RequestParam Long id) {
        return service.getOrdersById(id);
    }

    @PutMapping()
    public Orders updateOrders(@RequestBody Orders orders) {
        return service.updateOrders(orders);
    }

    @DeleteMapping()
    public void deleteOrders(@RequestParam Long id) {
        service.deleteOrders(id);
    }
}