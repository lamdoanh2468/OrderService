package com.furniro.OrderService.database.repository.cart;

import com.furniro.OrderService.database.entity.cart.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CartRepository extends JpaRepository<Cart,Integer> {
    Optional<Cart> findByUserID(Integer userID);

    Optional<Cart> findByCartIDAndUserID(Integer cartID, Integer userID);
}
