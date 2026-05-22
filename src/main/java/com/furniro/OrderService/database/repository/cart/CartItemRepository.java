package com.furniro.OrderService.database.repository.cart;

import com.furniro.OrderService.database.entity.cart.Cart;
import com.furniro.OrderService.database.entity.cart.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CartItemRepository extends JpaRepository<CartItem,Integer> {
    Optional<CartItem> findByCartAndVariantID(Cart cart, Integer variantID);

}
