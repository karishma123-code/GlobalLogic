package com.order.service;

import java.util.List;

import com.order.entity.Order;

public interface OrderService {
	
	public List<Order> getOrdersOfProduct(Long productId);

}
