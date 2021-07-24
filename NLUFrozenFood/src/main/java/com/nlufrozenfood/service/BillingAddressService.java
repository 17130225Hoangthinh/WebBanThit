package com.nlufrozenfood.service;

import com.nlufrozenfood.domain.BillingAddress;
import com.nlufrozenfood.domain.UserBilling;

public interface BillingAddressService {
	BillingAddress setByUserBilling(UserBilling userBilling, BillingAddress billingAddress);
}
