package com.greatoutdoor.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//ORDER pojo class
@Entity
@Table(name="order_manage")
public class Order {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long orderId;
	private long userId;
	//Data member of product-service
	private long productId;
	private long addressId;
	private int orderQuantity;
	private String dispatchDate;
	private String deliveryDate;
	
	
	public Order() {
		super();
	}
	
	public Order(long orderId, long userId, long productId, long addressId, int orderQuantity,
			String dispatchDate, String deliveryDate) {
		super();
		this.orderId = orderId;
		this.userId = userId;
		this.productId = productId;
		this.addressId = addressId;
		this.orderQuantity = orderQuantity;
		this.dispatchDate = dispatchDate;
		this.deliveryDate = deliveryDate;
	}

	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public long getAddressId() {
		return addressId;
	}
	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}
	public int getOrderQuantity() {
		return orderQuantity;
	}
	public void setOrderQuantity(int orderQuantity) {
		this.orderQuantity = orderQuantity;
	}public String getDispatchDate() {
		return dispatchDate;
	}
	public void setDispatchDate(String dispatchDate) {
		this.dispatchDate = dispatchDate;
	}
	public String getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	
}