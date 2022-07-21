package com.springjdbc.onlinesweetshop.admin;
//POJOs basically define an entity.
//Admin Pojo class
public class Admin {
	
	//Admin class data members
	private int userId;
	private String userName;
	private String password;
	/**
	 * 
	 */
	//default constructor
	public Admin() {
		super();
	}
	/**
	 * @param userId
	 * @param userName
	 * @param password
	 */
	//parameterized class
	public Admin(int userId, String userName, String password) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
	}
	
	//getter and setter methods
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	//toString()
	@Override
	public String toString() {
		return "Admin [userId=" + userId + ", userName=" + userName + ", password=" + password + "]";
	}
	
}
