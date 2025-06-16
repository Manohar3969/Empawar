package com.manohar3969.empawar.controller;

import com.manohar3969.empawar.model.Order;
import com.manohar3969.empawar.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }

    @PostMapping
    public Order createProduct(@RequestBody Order order) {
        return orderService.createProduct(order);
    }

    @GetMapping("/{orderId}")
    public Optional<Order> getOrderById(@PathVariable String orderId) {
        return orderService.getOrderById(orderId);
    }
}
