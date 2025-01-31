package com.example.checkout_service.service.implementation;

import org.springframework.stereotype.Service;

import com.example.checkout_service.model.dto.Product;
import com.example.checkout_service.repository.FeignProductRepository;
import com.example.checkout_service.service.IProductService;

@Service
public class ProductService  implements IProductService{
	
	private FeignProductRepository feignProductRepository;
	
	

	public ProductService(FeignProductRepository feignProductRepository) {
		super();
		this.feignProductRepository = feignProductRepository;
	}



	@Override
	public Product getProduct(String id) {
	return feignProductRepository.getProductById(id);
	}

}
