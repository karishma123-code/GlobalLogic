package com.greatoutdoor.controller;

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
import org.springframework.web.client.RestTemplate;

import com.greatoutdoor.common.Product;
import com.greatoutdoor.common.RequestAndResponse;
import com.greatoutdoor.entity.Order;
import com.greatoutdoor.exception.OrderException;
import com.greatoutdoor.service.OrderService;

//Controller for handling HTTP request from client
@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderService service;

	@Autowired
	private RestTemplate restTemplate;

	public OrderController(OrderService service) {
		super();
		this.service = service;

	}

	// add orders
	@PostMapping("/add")
	public RequestAndResponse placeOrder(@RequestBody RequestAndResponse request) {
		Product product = new Product();
		product = restTemplate.postForObject("http://localhost:9090/product/addProduct", request.getProductId(),
				Product.class);
		Order order = new Order();
		order.setProductId(product.getProductId());
		order.setUserId(request.getUserId());
		order.setAddressId(request.getAddressId());
		order.setOrderQuantity(request.getOrderQuantity());
		order.setDispatchDate(request.getDispatchDate());
		order.setDeliveryDate(request.getDeliveryDate());
		order.setUserId(request.getUserId());
		order.setOrderId(request.getOrderId());
		order = service.placeOrder(order);
		return new RequestAndResponse(order.getOrderId(), order.getUserId(), product, order.getAddressId(),
				order.getOrderQuantity(), order.getDispatchDate(), order.getDeliveryDate());

	}

	// Find All Orders
	@GetMapping("/findAllOrders")
	public List<Order> findAllOrders() {
		return service.findAllOrders();
	}

	// find by id
	@GetMapping("findById/{id}")
	public RequestAndResponse findOrderById(@PathVariable("id") long orderId) throws OrderException {
		Product product = new Product();
		Order order = service.findOrderById(orderId);
		product = restTemplate.getForObject("http://localhost:9090/product/viewById/" + order.getProductId(),
				Product.class);
		return new RequestAndResponse(order.getOrderId(), order.getUserId(), product, order.getAddressId(),
				order.getOrderQuantity(), order.getDispatchDate(), order.getDeliveryDate());

	}

	// Delete All Orders
	@DeleteMapping("/deleteAllOrders")
	public String cancelAllOrders() throws OrderException {
		return service.cancelAllOrders();
	}

	// Delete Order By Using Order Id
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteAnItemFromCart(@PathVariable("id") Long oId) throws OrderException {
		service.cancelOrderById(oId);
		return new ResponseEntity<String>("Order deleted successfully!", HttpStatus.OK);
	}

	// updating the order
	@PutMapping("/update/{id}")
	public RequestAndResponse updateOrders(@PathVariable("id") Long id, @RequestBody RequestAndResponse request)
			throws OrderException {
		Product product = new Product();
		Order order = service.findOrderById(id);
		restTemplate.put("http://localhost:9090/product/update/" + order.getProductId(), request.getProductId(),
				Product.class);
		product = restTemplate.getForObject("http://localhost:9090/product/viewById/" + order.getProductId(),
				Product.class);
		Order or = new Order();
		or.setDeliveryDate(request.getDeliveryDate());
		or.setDispatchDate(request.getDispatchDate());
		or.setAddressId(request.getAddressId());
		or.setOrderQuantity(request.getOrderQuantity());
		or.setUserId(request.getUserId());
		or.setOrderId(request.getOrderId());

		order = service.updateDate(or, id);
		return new RequestAndResponse(order.getOrderId(), order.getUserId(), product, order.getAddressId(),
				order.getOrderQuantity(), order.getDispatchDate(), order.getDeliveryDate());

	}
}