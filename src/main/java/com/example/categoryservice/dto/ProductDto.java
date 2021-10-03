package com.example.categoryservice.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter @Getter
public class ProductDto implements Serializable{
    private String productId;
    private Integer qty;
    private Integer unitPrice;
    private Integer totalPrice;

    private String orderId;
    private String userId;

}
