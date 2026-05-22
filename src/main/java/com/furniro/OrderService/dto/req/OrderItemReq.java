package com.furniro.OrderService.dto.req;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderItemReq {

    private Integer variantID;

    private Integer quantity;

    private BigDecimal price;
}