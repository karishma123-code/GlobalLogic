package com.springjdbc.onlinesweetshop.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.springjdbc.onlinesweetshop.admin.Sweets;

public class SweetDao implements SweetInterface {

	// Jdbc Template class

	private JdbcTemplate jdbcTemplate;

	// getter and setter
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	// insert new sweets
	public int insert(Sweets sweet) {
		String query = "insert into sweet(sweetid,sweetname,sweetprice,sweetbrand,offer)values (?,?,?,?,?)";
		int r = this.jdbcTemplate.update(query, sweet.getSweetId(), sweet.getSweetName(), sweet.getSweetPrice(),
				sweet.getSweetBrand(), sweet.getSweetOffer());
		return r;
	}

	// update/change existing sweets details
	public int change(Sweets sweet) {
		// Updating data
		String query = "update sweet set sweetname=? ,sweetbrand=? ,sweetprice=?,offer=? where sweetid=?";
		int r = this.jdbcTemplate.update(query, sweet.getSweetId(), sweet.getSweetName(), sweet.getSweetPrice(),
				sweet.getSweetBrand(), sweet.getSweetOffer());
		return r;
	}

	// deleting the existing sweets
	public int delete(int sweetId) {
		// delete the data
		String query = "delete from sweet where sweetid=?";
		int r = this.jdbcTemplate.update(query, sweetId);
		return r;
	}

}
