package com.springjdbc.onlinesweetshop.admin;
//Sweets Pojo class

public class Sweets {

	// data members of sweet class
	private int sweetId;

	private String sweetName;
	private int sweetPrice;
	private String sweetBrand;
	private float offer;

	/**
	 * 
	 */
	// default constructor
	public Sweets() {
		super();
	}

	// parametrized constructor
	/**
	 * @param sweetId
	 * @param sweetName
	 * @param sweetPrice
	 * @param sweetBrand
	 */
	public Sweets(int sweetId, String sweetName, int sweetPrice, String sweetBrand, float offer) {
		super();
		this.sweetId = sweetId;
		this.sweetName = sweetName;
		this.sweetPrice = sweetPrice;
		this.sweetBrand = sweetBrand;
		this.offer = offer;
	}

	// getter and setter
	public int getSweetId() {
		return sweetId;
	}

	public void setSweetId(int sweetId) {
		this.sweetId = sweetId;
	}

	public String getSweetName() {
		return sweetName;
	}

	public void setSweetName(String sweetName) {
		this.sweetName = sweetName;
	}

	public int getSweetPrice() {
		return sweetPrice;
	}

	public void setSweetPrice(int sweetPrice) {
		this.sweetPrice = sweetPrice;
	}

	public String getSweetBrand() {
		return sweetBrand;
	}

	public void setSweetBrand(String sweetBrand) {
		this.sweetBrand = sweetBrand;
	}

	public void setSweetOffer(float offer) {
		this.offer = offer;
	}

	public float getSweetOffer() {
		return offer;
	}

	// toString()
	@Override
	public String toString() {
		return "Sweets [sweetId=" + sweetId + ", sweetName=" + sweetName + ", sweetPrice=" + sweetPrice
				+ ", sweetBrand=" + sweetBrand + ", offer=" + offer + "]";
	}

}
