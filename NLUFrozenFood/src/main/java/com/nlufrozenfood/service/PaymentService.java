package com.nlufrozenfood.service;

import com.nlufrozenfood.domain.Payment;
import com.nlufrozenfood.domain.UserPayment;

public interface PaymentService {
	Payment setByUserPayment(UserPayment userPayment, Payment payment);
}
