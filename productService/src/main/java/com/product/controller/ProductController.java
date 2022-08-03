package com.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.product.entity.Product;
import com.product.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/{productId}")
	public Product getProduct(@PathVariable("productId")Long productId) {
		
		//http://localhost:9002/order/product/101
		Product product=this.productService.getProduct(productId);
		
		List orders=this.restTemplate.getForObject("http://order-service/order/product/"+product.getProductId(),List.class);
		product.setOrder(orders);
		return product;
	}

}
