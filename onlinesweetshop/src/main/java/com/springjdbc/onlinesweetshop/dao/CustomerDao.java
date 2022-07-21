package com.springjdbc.onlinesweetshop.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.springjdbc.onlinesweetshop.admin.Customer;

public class CustomerDao implements CustomerInterface {
	// Jdbc Template class

	private JdbcTemplate jdbcTemplate;

	// getter and setter
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	// insert new customers
	public int insert(Customer customer) {
		String query = "insert into customer(customerid,customername,customercity)values (?,?,?)";
		int r = this.jdbcTemplate.update(query, customer.getcId(), customer.getcName(), customer.getcCity());
		return r;
	}

	// update/change existing customer details
	public int change(Customer customer) {
		// Updating data
		String query = "update customer set customername=? , customercity=? where customerid=?";
		int r = this.jdbcTemplate.update(query, customer.getcId(), customer.getcName(), customer.getcCity());
		return r;
	}

	// deleting the existing customer
	public int delete(int cId) {
		// delete the data
		String query = "delete from customer where customerid=?";
		int r = this.jdbcTemplate.update(query, cId);
		return r;
	}

}