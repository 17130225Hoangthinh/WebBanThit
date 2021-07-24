package com.nlufrozenfood.repository;

import org.springframework.data.repository.CrudRepository;

import com.nlufrozenfood.domain.Order;

public interface OrderRepository extends CrudRepository<Order, Long>{

}
