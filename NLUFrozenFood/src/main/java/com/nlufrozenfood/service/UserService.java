package com.nlufrozenfood.service;

import java.util.Set;

import com.nlufrozenfood.domain.User;
import com.nlufrozenfood.domain.UserBilling;
import com.nlufrozenfood.domain.UserPayment;
import com.nlufrozenfood.domain.UserShipping;
import com.nlufrozenfood.domain.security.PasswordResetToken;
import com.nlufrozenfood.domain.security.UserRole;

public interface UserService {
	PasswordResetToken getPasswordResetToken(final String token);
	
	void createPasswordResetTokenForUser(final User user, final String token);
	
	User findByUsername(String username);
	
	User findByEmail (String email);
	
	User findById(Long id);
	
	User createUser(User user, Set<UserRole> userRoles) throws Exception;
	
	User save(User user);
	
	void updateUserBilling(UserBilling userBilling, UserPayment userPayment, User user);
	
	void updateUserShipping(UserShipping userShipping, User user);
	
	void setUserDefaultPayment(Long userPaymentId, User user);
	
	void setUserDefaultShipping(Long userShippingId, User user);
}
