package com.springjdbc.onlinesweetshop.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.springjdbc.onlinesweetshop.admin.Admin;

//DAOClass-- easy to work with data access technologies like JDBC, Hibernate, JPA 
public class AdminDao implements AdminInterface {
	// Jdbc Template class

	// dependency injection
	private JdbcTemplate jdbcTemplate;

	// getter and setter

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	// insert new customers
	public int insert(Admin admin) {
		String query = "insert into admin(userid,username,password)values (?,?,?)";
		int r = this.jdbcTemplate.update(query, admin.getUserId(), admin.getUserName(), admin.getPassword());
		return r;
	}

	// update/change existing customer details
	public int change(Admin admin) {
		// Updating data
		String query = "update admin set username=? , password=? where userid=?";
		int r = this.jdbcTemplate.update(query, admin.getUserId(), admin.getUserName(), admin.getPassword());
		return r;
	}

	// deleting the existing customer
	public int delete(int userId) {
		// delete the data
		String query = "delete from admin where userid=?";
		int r = this.jdbcTemplate.update(query, userId);
		return r;
	}

}
