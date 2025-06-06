package com.manohar3969.empawar.controller;

import com.manohar3969.empawar.model.Order;
import com.manohar3969.empawar.model.OrderItem;
import com.manohar3969.empawar.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/orderitems")
public class OrderItemController {

    @Autowired
    private OrderItemService orderItemService;

    @GetMapping
    public List<OrderItem> getAllOrderItems() {
        return orderItemService.getAllOrderItems();
    }

    @PostMapping
    public OrderItem createProduct(@RequestBody OrderItem orderItem) {
        return orderItemService.createProduct(orderItem);
    }

    @GetMapping("/{orderId}")
    public List<OrderItem> getOrderItemsForOrderId(@PathVariable String orderId){
        return orderItemService.getOrderItemsByOrderId(orderId);
    }
}
