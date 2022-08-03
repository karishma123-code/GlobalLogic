package com.product.entity;

import java.util.ArrayList;
import java.util.List;

public class Product {
	// POJO Class of Product
	// Data members
	private Long productId;
	private String productName;
	private String productDesc;

	List<Order> order = new ArrayList<>();

	// default
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Parameterized
	public Product(Long productId, String productName, String productDesc, List<Order> order) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDesc = productDesc;
		this.order = order;
	}

	public Product(Long productId, String productName, String productDesc) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDesc = productDesc;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public List<Order> getOrder() {
		return order;
	}

	public void setOrder(List<Order> order) {
		this.order = order;
	}

}
