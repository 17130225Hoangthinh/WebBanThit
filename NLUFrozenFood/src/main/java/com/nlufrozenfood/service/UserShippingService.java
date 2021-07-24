package com.nlufrozenfood.service;

import com.nlufrozenfood.domain.UserShipping;

public interface UserShippingService {
	UserShipping findById(Long id);
	
	void removeById(Long id);
}
