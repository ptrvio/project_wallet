package com.example.checkout_service.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.checkout_service.model.Checkout;
import com.example.checkout_service.service.ICheckoutService;

@RestController
@RequestMapping(value ="/checkout")
public class CheckoutRestController {
	private ICheckoutService checkoutService;
	
	
	
	public CheckoutRestController(ICheckoutService checkoutService) {
		super();
		this.checkoutService = checkoutService;
	}



	@GetMapping()
	public Checkout getCheckout(@RequestParam List<String> productIds) {
		
		return checkoutService.buildCheckout(productIds);
		
	}

}
