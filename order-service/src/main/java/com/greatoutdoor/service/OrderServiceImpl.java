package com.greatoutdoor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatoutdoor.entity.Order;
import com.greatoutdoor.exception.OrderException;
import com.greatoutdoor.repository.OrderRepository;
//Service layer to perform business logic
@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderRepository repo;

	@Override
	public Order placeOrder(Order o) {
		return repo.save(o);
	}
    //Find all order
	@Override
	public List<Order> findAllOrders() {
		return repo.findAll();
	}
	
     //find Order by Id
	@Override
	public Order findOrderById(long oId) throws OrderException {
		return repo.findById(oId).orElseThrow(() -> new OrderException("There is no such order id exist"));
	}
	
    //cancel all order
	@Override
	public String cancelAllOrders() throws OrderException {
		repo.deleteAll();
		return "all orders deleted successfuly";
	}
	
    //cancel the order by id
	@Override
	public String cancelOrderById(long oId) throws OrderException {
		if (repo.existsById(oId)) {
			repo.deleteById(oId);
			return "delete succesful";
		} else {
			throw new OrderException("Order Id is Not found");
		}
	}
	
    //Update the data by id
	@Override
	public Order updateDate(Order o, long oId) throws OrderException {
		Order exist = repo.findById(oId).orElseThrow(()-> new OrderException("No order id exist"));
		exist.setDispatchDate(o.getDispatchDate());
		exist.setDeliveryDate(o.getDeliveryDate());
		exist.setOrderQuantity(o.getOrderQuantity());
		exist.setOrderId(o.getOrderId());
	    return repo.save(exist);
	    
	}

	
}