package com.product.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.exception.ProductException;
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
	//Filter 
	//public List<Product> listAll(String keyword) {
       // if (keyword != null) {
         //   return productRepository.search(keyword);
        //}
        //return productRepository.findAll();
   // }

	@Override
	@Transactional
	public List<Product> searchByName(String productName) {
		
		List<Product> list= productRepository.findByProductName(productName);
		if(list.isEmpty()) {
			throw new ProductException("No product name found");
		}
		else {
			return list;
		}
	}

	@Override
	@Transactional
	public List<Product> searchByKeyword(String productName) {
	   
		List<Product> list=productRepository.findByProductNameContaining(productName);
		if(list.isEmpty()) {
			throw new ProductException("No matching product found");
		}
		else {
			return list;
		}		
	}

	@Override
	public List<Product> filterByPrice(double price) {
		List<Product> list=productRepository.findByPriceLessThan(price);
		if(list.isEmpty()) {
			throw new ProductException("No product is present less than the price");
		}
		else {
			return list;
			}
	}

}
