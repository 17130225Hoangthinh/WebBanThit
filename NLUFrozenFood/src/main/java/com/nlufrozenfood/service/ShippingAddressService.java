package com.nlufrozenfood.service;

import com.nlufrozenfood.domain.ShippingAddress;
import com.nlufrozenfood.domain.UserShipping;

public interface ShippingAddressService {
	ShippingAddress setByUserShipping(UserShipping userShipping, ShippingAddress shippingAddress);
}
