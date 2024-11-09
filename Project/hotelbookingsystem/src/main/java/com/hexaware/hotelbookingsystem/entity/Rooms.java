package com.hexaware.hotelbookingsystem.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Rooms {
		@Id
		private Integer roomId;
          
	    private Integer roomNumber;        
		private RoomType roomType;          
		private Double pricePerNight;     
		private AvailabilityStatus availabilityStatus; 
		private Integer capacity;           
		private String description;
		
		@ManyToOne
	    @JoinColumn(name = "hotel_id")
	    private Hotels hotel; // Many-to-One relationship with Hotels

	    @OneToMany(mappedBy = "room")
	    private List<Bookings> bookings; // One-to-Many relationship with Bookings

	    @ManyToMany(mappedBy = "favoriteRooms")
	    private List<Users> users; // Many-to-Many relationship with Users (favorite rooms)
		public enum RoomType {
			SINGLE, DOUBLE, SUITE
		}
		
		public enum AvailabilityStatus {
			AVAILABLE, BOOKED
		}
		public Rooms() {
			super();
		}
	
		public Rooms(Integer roomId, Integer roomNumber, RoomType roomType, Double pricePerNight,
				AvailabilityStatus availabilityStatus, Integer capacity, String description, Hotels hotel,
				List<Bookings> bookings, List<Users> users) {
			super();
			this.roomId = roomId;
			this.roomNumber = roomNumber;
			this.roomType = roomType;
			this.pricePerNight = pricePerNight;
			this.availabilityStatus = availabilityStatus;
			this.capacity = capacity;
			this.description = description;
			this.hotel = hotel;
			this.bookings = bookings;
			this.users = users;
		}

		public Integer getRoomId() {
			return roomId;
		}

		public void setRoomId(Integer roomId) {
			this.roomId = roomId;
		}

		public Integer getRoomNumber() {
			return roomNumber;
		}

		public void setRoomNumber(Integer roomNumber) {
			this.roomNumber = roomNumber;
		}

		public RoomType getRoomType() {
			return roomType;
		}

		public void setRoomType(RoomType roomType) {
			this.roomType = roomType;
		}

		public Double getPricePerNight() {
			return pricePerNight;
		}

		public void setPricePerNight(Double pricePerNight) {
			this.pricePerNight = pricePerNight;
		}

		public AvailabilityStatus getAvailabilityStatus() {
			return availabilityStatus;
		}

		public void setAvailabilityStatus(AvailabilityStatus availabilityStatus) {
			this.availabilityStatus = availabilityStatus;
		}

		public Integer getCapacity() {
			return capacity;
		}

		public void setCapacity(Integer capacity) {
			this.capacity = capacity;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
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

		public List<Users> getUsers() {
			return users;
		}

		public void setUsers(List<Users> users) {
			this.users = users;
		}

		

		

	}

