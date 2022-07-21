package com.springjdbc.onlinesweetshop.admin;

//POJO class for customer
public class Customer {

	// data members
	private int cId;
	private String cName;
	private String cCity;

	/**
	 * 
	 */
	// default constructor
	public Customer() {
		super();
	}

	// parameterized constructor
	/**
	 * @param cId
	 * @param cName
	 * @param cCity
	 */

	public Customer(int cId, String cName, String cCity) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cCity = cCity;
	}

	// getter andn setter

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcCity() {
		return cCity;
	}

	public void setcCity(String cCity) {
		this.cCity = cCity;
	}

	// toString()
	@Override
	public String toString() {
		return "Customer [cId=" + cId + ", cName=" + cName + ", cCity=" + cCity + "]";
	}

}
