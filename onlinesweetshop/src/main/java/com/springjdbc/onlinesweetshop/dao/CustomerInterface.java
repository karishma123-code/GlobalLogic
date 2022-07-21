package com.springjdbc.onlinesweetshop.dao;

import com.springjdbc.onlinesweetshop.admin.Customer;

//Creating an Interface
public interface CustomerInterface {
	public int insert(Customer customer);

	public int change(Customer customer);

	public int delete(int cId);
	}
