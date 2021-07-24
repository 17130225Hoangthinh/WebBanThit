package com.nlufrozenfood.repository;

import org.springframework.data.repository.CrudRepository;

import com.nlufrozenfood.domain.ShoppingCart;

public interface ShoppingCartRepository extends CrudRepository<ShoppingCart, Long> {

}
