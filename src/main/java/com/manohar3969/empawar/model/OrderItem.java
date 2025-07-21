package com.manohar3969.empawar.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "order_items")
@Data
public class OrderItem {
    @Id
    private String orderItemId;
    private String orderId;
    private String orderItemName;
    private String orderItemQuantity;
    private String orderItemCostPrice;
    private String orderItemSellingPrice;
    private String orderItemDiscount;
    private String orderItemSize;
    private String orderItemTotalPrice;
    private String orderItemImage;

    public String getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(String orderItemId) {
        this.orderItemId = orderItemId;
    }

    public String getOrderItemName() {
        return orderItemName;
    }

    public void setOrderItemName(String orderItemName) {
        this.orderItemName = orderItemName;
    }

    public String getOrderItemQuantity() {
        return orderItemQuantity;
    }

    public void setOrderItemQuantity(String orderItemQuantity) {
        this.orderItemQuantity = orderItemQuantity;
    }

    public String getOrderItemCostPrice() {
        return orderItemCostPrice;
    }

    public void setOrderItemCostPrice(String orderItemCostPrice) {
        this.orderItemCostPrice = orderItemCostPrice;
    }

    public String getOrderItemSellingPrice() {
        return orderItemSellingPrice;
    }

    public void setOrderItemSellingPrice(String orderItemSellingPrice) {
        this.orderItemSellingPrice = orderItemSellingPrice;
    }

    public String getOrderItemDiscount() {
        return orderItemDiscount;
    }

    public void setOrderItemDiscount(String orderItemDiscount) {
        this.orderItemDiscount = orderItemDiscount;
    }

    public String getOrderItemSize() {
        return orderItemSize;
    }

    public void setOrderItemSize(String orderItemSize) {
        this.orderItemSize = orderItemSize;
    }

    public String getOrderItemTotalPrice() {
        return orderItemTotalPrice;
    }

    public void setOrderItemTotalPrice(String orderItemTotalPrice) {
        this.orderItemTotalPrice = orderItemTotalPrice;
    }

    public String getOrderItemImage() {
        return orderItemImage;
    }

    public void setOrderItemImage(String orderItemImage) {
        this.orderItemImage = orderItemImage;
    }
}
