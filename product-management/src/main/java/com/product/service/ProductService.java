package com.product.service;

import java.util.List;

import com.product.model.Product;

//Interface used to declare the CRUD or Abstract methods

public interface ProductService {
	
	//Add the product
	Product addProduct(Product product);
	
	//View all products
	List<Product> viewAllProducts();
	
	//View the product by id
	public Product viewProduct(Long id);
	
	//Update the product
	public Product  editProduct(Product product);
	
	//Delete the product
	 void deleteProduct(long productId);
	 
	 List<Product> searchByName(String productName);

		List<Product> searchByKeyword(String productName);
		
		List<Product> filterByPrice(double price);

}
