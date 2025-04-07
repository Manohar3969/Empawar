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
    private String productID;
    private String orderItemQuantity;
    private String orderItemSize;
    private String orderItemPrice;
}
