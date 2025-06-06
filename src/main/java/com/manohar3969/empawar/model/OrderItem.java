package com.manohar3969.empawar.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "order_items")
@Data
public class OrderItem {
    @Id
    private String orderItemId;
    private String orderId;
    private String productID;
    private String orderItemQuantity;
    private String orderItemSize;
    private String orderItemPrice;

    public OrderItem(String orderItemId, String orderId, String productID, String orderItemQuantity, String orderItemSize, String orderItemPrice) {
        this.orderItemId = orderItemId;
        this.orderId = orderId;
        this.productID = productID;
        this.orderItemQuantity = orderItemQuantity;
        this.orderItemSize = orderItemSize;
        this.orderItemPrice = orderItemPrice;
    }

    public String getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(String orderItemId) {
        this.orderItemId = orderItemId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getOrderItemQuantity() {
        return orderItemQuantity;
    }

    public void setOrderItemQuantity(String orderItemQuantity) {
        this.orderItemQuantity = orderItemQuantity;
    }

    public String getOrderItemSize() {
        return orderItemSize;
    }

    public void setOrderItemSize(String orderItemSize) {
        this.orderItemSize = orderItemSize;
    }

    public String getOrderItemPrice() {
        return orderItemPrice;
    }

    public void setOrderItemPrice(String orderItemPrice) {
        this.orderItemPrice = orderItemPrice;
    }
}
