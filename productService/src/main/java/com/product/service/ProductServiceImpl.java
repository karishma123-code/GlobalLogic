package com.product.service;

import java.util.List;


import org.springframework.stereotype.Service;

import com.product.entity.Product;
@Service
public class ProductServiceImpl implements ProductService {
	
	//Product list
	List<Product>list=List.of(new Product(101L,"Iphone","Apple company 64GB"),
			new Product(102L,"OnePlus"," 64GB"),
			new Product(103L,"BoAt Headphones","BoAt company bluetooth"));

	@Override
	public Product getProduct(Long id) {
		// TODO Auto-generated method stub
		// this.list.stream().filter(product->product.getProductId().equals(id).findAny());
		return list.stream()
				.filter( product -> product.getProductId().equals(id)).findAny().orElse(null);
	}

}
