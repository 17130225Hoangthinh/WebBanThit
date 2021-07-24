package com.nlufrozenfood.service;

import java.util.List;

import com.nlufrozenfood.domain.Product;
import com.nlufrozenfood.domain.CartItem;
import com.nlufrozenfood.domain.Order;
import com.nlufrozenfood.domain.ShoppingCart;
import com.nlufrozenfood.domain.User;

public interface CartItemService {
	List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);
	
	CartItem updateCartItem(CartItem cartItem);
	
	CartItem addProductToCartItem(Product product, User user, int qty);
	
	CartItem findById(Long id);
	
	void removeCartItem(CartItem cartItem);
	
	CartItem save(CartItem cartItem);
	
	List<CartItem> findByOrder(Order order);
}
