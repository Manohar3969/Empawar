package com.manohar3969.empawar.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document(collection = "orders")
@Data
public class Order {
    @Id
    private String orderId;
    private String userId;
    private String orderPrice;
    private String addressID;
    private Date deliveryDate;
    private Date orderDate;
    private String orderStatus;
    private List<String> orderItems;
}
