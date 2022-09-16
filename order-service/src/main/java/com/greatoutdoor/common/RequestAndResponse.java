package com.greatoutdoor.common;


public class RequestAndResponse {

	private long orderId;
	private long userId;
	// Data member of product-service
	private Product productId;
	private long addressId;
	private int orderQuantity;
	private String dispatchDate;
	private String deliveryDate;

	public RequestAndResponse() {
		super();
		
	}

	public RequestAndResponse(long orderId, long userId, Product productId, long addressId, int orderQuantity,
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

	public long getUserId() {
		return userId;
	}

	public Product getProductId() {
		return productId;
	}

	public long getAddressId() {
		return addressId;
	}

	public int getOrderQuantity() {
		return orderQuantity;
	}

	public String getDispatchDate() {
		return dispatchDate;
	}

	public String getDeliveryDate() {
		return deliveryDate;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public void setProductId(Product productId) {
		this.productId = productId;
	}

	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}

	public void setOrderQuantity(int orderQuantity) {
		this.orderQuantity = orderQuantity;
	}

	public void setDispatchDate(String dispatchDate) {
		this.dispatchDate = dispatchDate;
	}

	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

}
