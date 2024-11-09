package com.hexaware.hotelbookingsystem.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Hotels {
	
	@Id
	private Integer hotelId;                
	 private String hotelName;
	       
	 private String address;     
	 private String city;          
	 private String description;
	 private Integer contactNumber;
	 private Double rating;
	 
	 @OneToOne
	    @JoinColumn(name = "user_id")
	    private Users user; // One-to-One mapping with Users (HOTEL_OWNER)

	    @OneToMany(mappedBy = "hotel")
	    private List<Rooms> rooms; // One-to-Many relationship with Rooms

	    @OneToMany(mappedBy = "hotel")
	    private List<Reviews> reviews; // One-to-Many relationship with Reviews
	public Hotels() {
		super();
	}

	public Hotels(Integer hotelId, String hotelName, String address, String city, String description,
			Integer contactNumber, Double rating, Users user, List<Rooms> rooms, List<Reviews> reviews) {
		super();
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.address = address;
		this.city = city;
		this.description = description;
		this.contactNumber = contactNumber;
		this.rating = rating;
		this.user = user;
		this.rooms = rooms;
		this.reviews = reviews;
	}



	public Integer getHotelId() {
		return hotelId;
	}



	public void setHotelId(Integer hotelId) {
		this.hotelId = hotelId;
	}



	public String getHotelName() {
		return hotelName;
	}



	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
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



	public Integer getContactNumber() {
		return contactNumber;
	}



	public void setContactNumber(Integer contactNumber) {
		this.contactNumber = contactNumber;
	}



	public Double getRating() {
		return rating;
	}



	public void setRating(Double rating) {
		this.rating = rating;
	}



	public Users getUser() {
		return user;
	}



	public void setUser(Users user) {
		this.user = user;
	}



	public List<Rooms> getRooms() {
		return rooms;
	}



	public void setRooms(List<Rooms> rooms) {
		this.rooms = rooms;
	}



	public List<Reviews> getReviews() {
		return reviews;
	}



	public void setReviews(List<Reviews> reviews) {
		this.reviews = reviews;
	}
	

	

	

}
