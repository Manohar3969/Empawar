package com.manohar3969.empawar.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
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
