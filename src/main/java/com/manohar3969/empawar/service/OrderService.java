package com.manohar3969.empawar.service;

import com.manohar3969.empawar.model.Order;
import com.manohar3969.empawar.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Order createProduct(Order order) {
        return orderRepository.save(order);
    }

    public Optional<Order> getOrderById(String orderId){
        return orderRepository.findByOrderId(orderId);
    }
}
