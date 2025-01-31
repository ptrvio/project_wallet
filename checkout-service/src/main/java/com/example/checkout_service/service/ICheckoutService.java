package com.example.checkout_service.service;

import java.util.List;

import com.example.checkout_service.model.Checkout;

public interface ICheckoutService {
	
	public Checkout buildCheckout(List<String> productIds);

}
