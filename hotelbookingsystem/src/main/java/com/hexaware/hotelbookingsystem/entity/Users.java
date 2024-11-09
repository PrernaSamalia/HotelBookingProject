package com.hexaware.hotelbookingsystem.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Users {
	@Id
	private Integer userId;
	private String email;
	private String password;
	private String name;
	private Integer phoneNumber;
	private LocalDate dateCreated;
	private UserRole userrole;
	
	@OneToOne(mappedBy = "user")
    private Hotels hotel; // One-to-One mapping with Hotels (only for HOTEL_OWNER)

    @OneToMany(mappedBy = "user")
    private List<Bookings> bookings; // One-to-Many mapping with Bookings (for GUEST users)

    @OneToMany(mappedBy = "user")
    private List<Reviews> reviews; // One-to-Many mapping with Reviews
	
    @ManyToMany
    @JoinTable(
        name = "user_favorite_rooms",
        joinColumns = @JoinColumn(name = "user_id"),
        inverseJoinColumns = @JoinColumn(name = "room_id")
    )
    private List<Rooms> favoriteRooms;
	public enum UserRole {
		GUEST, HOTELOWNER , ADMIN
	}
	
	public Users() {
		super();
	}
	


	public Users(Integer userId, String email, String password, String name, Integer phoneNumber, LocalDate dateCreated,
			UserRole userrole, Hotels hotel, List<Bookings> bookings, List<Reviews> reviews,
			List<Rooms> favoriteRooms) {
		super();
		this.userId = userId;
		this.email = email;
		this.password = password;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.dateCreated = dateCreated;
		this.userrole = userrole;
		this.hotel = hotel;
		this.bookings = bookings;
		this.reviews = reviews;
		this.favoriteRooms = favoriteRooms;
	}



	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public LocalDate getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(LocalDate dateCreated) {
		this.dateCreated = dateCreated;
	}

	public UserRole getUserrole() {
		return userrole;
	}

	public void setUserrole(UserRole userrole) {
		this.userrole = userrole;
	}

	public Hotels getHotel() {
		return hotel;
	}

	public void setHotel(Hotels hotel) {
		this.hotel = hotel;
	}

	public List<Bookings> getBookings() {
		return bookings;
	}

	public void setBookings(List<Bookings> bookings) {
		this.bookings = bookings;
	}

	public List<Reviews> getReviews() {
		return reviews;
	}

	public void setReviews(List<Reviews> reviews) {
		this.reviews = reviews;
	}

	public List<Rooms> getFavoriteRooms() {
		return favoriteRooms;
	}

	public void setFavoriteRooms(List<Rooms> favoriteRooms) {
		this.favoriteRooms = favoriteRooms;
	}

	
	
	
	
}

