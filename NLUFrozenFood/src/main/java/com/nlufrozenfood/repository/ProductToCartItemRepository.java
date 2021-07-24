package com.nlufrozenfood.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.nlufrozenfood.domain.ProductToCartItem;
import com.nlufrozenfood.domain.CartItem;

@Transactional
public interface ProductToCartItemRepository extends CrudRepository<ProductToCartItem, Long> {
	void deleteByCartItem(CartItem cartItem);
}
