package com.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.model.Product;
import com.product.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	// Dependency Injection
	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product addProduct(Product product) {

		return productRepository.save(product);
	}

	@Override
	public List<Product> viewAllProducts() {
		
		return productRepository.findAll();
	}

	@Override
	public Product viewProduct(Long id) {
		
		return productRepository.findById(id).get();
	}

	@Override
	public Product editProduct(Product product) {
		
		return productRepository.save(product);
	}

	@Override
	public void deleteProduct(long productId) {
		
		productRepository.deleteById(productId);
	}

}
