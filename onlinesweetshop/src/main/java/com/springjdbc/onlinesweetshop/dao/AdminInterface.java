package com.springjdbc.onlinesweetshop.dao;

//Amin Interface class
import com.springjdbc.onlinesweetshop.admin.Admin;

public interface AdminInterface {
	public int insert(Admin admin);

	public int change(Admin admin);

	public int delete(int userId);

}
