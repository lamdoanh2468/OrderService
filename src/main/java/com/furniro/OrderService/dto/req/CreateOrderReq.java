package com.furniro.OrderService.dto.req;

import com.furniro.OrderService.utils.enums.OrderStatus;
import com.furniro.OrderService.utils.enums.PaymentMethod;
import lombok.Data;

import java.util.List;

@Data
public class CreateOrderReq {
    private Integer userID;

    private String note;

    private int shippingFee;

    private OrderStatus orderStatus;

    private String address;

    private PaymentMethod paymentMethod;

    private String currency;

    private List<OrderItemReq> orderItems;

}
