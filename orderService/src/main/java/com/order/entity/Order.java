package com.order.entity;

public class Order {
	// POJO Class of Order
		// data members
		private Long orderId;
		private String orderName;
		private String orderDesc;
		// data member of product class
		private Long productId;

		// default constructor
		public Order() {
			super();
			
		}
		
		//Parameterized constructor
		public Order(Long orderId, String orderName, String orderDesc, Long productId) {
			super();
			this.orderId = orderId;
			this.orderName = orderName;
			this.orderDesc = orderDesc;
			this.productId = productId;
		}

		public Long getOrderId() {
			return orderId;
		}

		public void setOrderId(Long orderId) {
			this.orderId = orderId;
		}

		public String getOrderName() {
			return orderName;
		}

		public void setOrderName(String orderName) {
			this.orderName = orderName;
		}

		public String getOrderDesc() {
			return orderDesc;
		}

		public void setOrderDesc(String orderDesc) {
			this.orderDesc = orderDesc;
		}

		public Long getProductId() {
			return productId;
		}

		public void setProductId(Long productId) {
			this.productId = productId;
		}
		
	}
