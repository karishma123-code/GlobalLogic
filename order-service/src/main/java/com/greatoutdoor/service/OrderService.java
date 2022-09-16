package com.greatoutdoor.service;

import java.util.List;

import com.greatoutdoor.entity.Order;
import com.greatoutdoor.exception.OrderException;

//Interface for declaring abstract methods
public interface OrderService {

	public Order placeOrder(Order o);// add order

	public List<Order> findAllOrders();// all order placed

	public Order findOrderById(long oId) throws OrderException;

	public String cancelAllOrders() throws OrderException;

	public String cancelOrderById(long oId) throws OrderException;

	public Order updateDate(Order o, long oId) throws OrderException;

}