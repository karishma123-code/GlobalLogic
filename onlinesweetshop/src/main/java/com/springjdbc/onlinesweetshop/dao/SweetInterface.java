package com.springjdbc.onlinesweetshop.dao;

import com.springjdbc.onlinesweetshop.admin.Sweets;

//Interface 
public interface SweetInterface {

	public int insert(Sweets sweet);

	public int change(Sweets sweet);

	public int delete(int sweetId);

}
