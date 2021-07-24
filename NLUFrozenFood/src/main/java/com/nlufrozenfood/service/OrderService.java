package com.nlufrozenfood.service;

import com.nlufrozenfood.domain.BillingAddress;
import com.nlufrozenfood.domain.Order;
import com.nlufrozenfood.domain.Payment;
import com.nlufrozenfood.domain.ShippingAddress;
import com.nlufrozenfood.domain.ShoppingCart;
import com.nlufrozenfood.domain.User;

public interface OrderService {
	Order createOrder(ShoppingCart shoppingCart,
			ShippingAddress shippingAddress,
			BillingAddress billingAddress,
			Payment payment,
			String shippingMethod,
			User user);
	
	Order findOne(Long id);
}
