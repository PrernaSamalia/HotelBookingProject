package com.hexaware.hbs.entity;

public class Hotels {
	 private int hotelId;                
	 private String hotelName;    
	 private int  userId;        
	 private String address;     
	 private String city;          
	 private String description;
	 private int contactNumber;
	 private double rating;
	 
	public Hotels() {
		super();
	}

	public Hotels(int hotelId, String hotelName, int userId, String address, String city, String description,
			int contactNumber, double rating) {
		super();
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.userId = userId;
		this.address = address;
		this.city = city;
		this.description = description;
		this.contactNumber = contactNumber;
		this.rating = rating;
	}

	public int getHotelId() {
		return hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Hotels [hotelId=" + hotelId + ", hotelName=" + hotelName + ", userId=" + userId + ", address=" + address
				+ ", city=" + city + ", description=" + description + ", contactNumber=" + contactNumber + ", rating="
				+ rating + "]";
	}
	 
	

}
