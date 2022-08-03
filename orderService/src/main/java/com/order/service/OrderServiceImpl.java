package com.order.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.order.entity.Order;
@Service
public class OrderServiceImpl implements OrderService {
	//fake list of products
	List<Order> list=List.of(new Order(1L,"Phone category iphone","Smartphone",101L),
			new Order(2L,"Phone category oneplus","Smartphone",102L),
			new Order(3L,"Headphone Category - BoAt","Bluetooth",103L));

	@Override
	public List<Order> getOrdersOfProduct(Long productId) {
		
		return list.stream().filter(order->order.getProductId()
				.equals(productId)).collect(Collectors.toList());
	}

}
