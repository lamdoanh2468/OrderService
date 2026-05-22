package com.furniro.OrderService.database.entity.order;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "OrderItem")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderItemID;

    @JsonBackReference(value = "order-items")
    @ManyToOne
    @JoinColumn(name = "OrderID")
    private Order order;

    @Column(name = "VariantID", nullable = false)
    private Integer variant;

    private Integer quantity;

    // Price after sale
    private BigDecimal priceAtPurchase;
}

