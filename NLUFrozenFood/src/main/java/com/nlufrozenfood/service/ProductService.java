	package com.nlufrozenfood.service;

import java.util.List;

import com.nlufrozenfood.domain.Product;

public interface ProductService {
	List<Product> findAll ();
	
	Product findOne(Long id);
	
	List<Product> findByCategory(String category);
	
	List<Product> blurrySearch(String title);
}
