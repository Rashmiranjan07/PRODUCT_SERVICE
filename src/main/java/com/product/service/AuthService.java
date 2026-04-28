package com.product.service;

import jakarta.servlet.http.HttpServletRequest;

public interface AuthService {
	String authUserNamePasswordService(String username,String password);
	
	String logOutService(HttpServletRequest request);

}
