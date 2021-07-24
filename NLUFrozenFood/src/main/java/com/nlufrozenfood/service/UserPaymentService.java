package com.nlufrozenfood.service;

import com.nlufrozenfood.domain.UserPayment;

public interface UserPaymentService {
	UserPayment findById(Long id);
	
	void removeById(Long id);
}
