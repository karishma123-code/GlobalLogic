package com.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.model.Product;
import com.product.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	// Dependency Injection
	@Autowired
	private ProductService productService;

	// Add a Product
	@PostMapping()
	public ResponseEntity<Product> addProduct(@RequestBody Product product) {
		return new ResponseEntity<Product>(productService.addProduct(product), HttpStatus.CREATED);
	}

	// View All Products
	@GetMapping("/viewProduct")
	public List<Product> viewAllProducts() {
		return productService.viewAllProducts();
	}

	// View product by id
	@GetMapping(value = "/{id}")
	public Product viewProduct(@PathVariable("id") Long id) {
		return productService.viewProduct(id);
	}

	// Update the product
	@PutMapping("/edit")
	public Product editProduct(@RequestBody Product product) {
		return productService.editProduct(product);
	}

	// Delete the product
	@DeleteMapping("delete/{productId}")
	public void deleteProduct(@PathVariable("productId") Long productId) {
       productService.deleteProduct(productId);
	}
	
	//Searching Product By ProductName
	@GetMapping(path= "/searchbyname/{productName}")
	public ResponseEntity<List<Product>> searchByName(@PathVariable String productName){
		
		List<Product> product= productService.searchByName(productName);
		
		return new ResponseEntity<List<Product>>(product, HttpStatus.OK);			
	}
	
	//Searching Product By Keyword
	@GetMapping(path= "/searchbykeyword/{productName}")
	public ResponseEntity<List<Product>> searchByKeyword(@PathVariable String productName) {
				
		List<Product> product= productService.searchByKeyword(productName);
					
		return new ResponseEntity<List<Product>>(product, HttpStatus.OK);	
		}
	
	//Filter by price
	@GetMapping(path= "/filter/{price}")
	public ResponseEntity<List<Product>> filterByPrice(@PathVariable("price") double price){
				
				List<Product> product= productService.filterByPrice(price);
				
				return new ResponseEntity<List<Product>>(product, HttpStatus.OK);			
			}
}
