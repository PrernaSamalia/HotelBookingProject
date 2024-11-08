package com.hexaware.hbs.entity;

public class Rooms {
	private int roomId;            
	private int hotelId;           
    private int roomNumber;        
	private String roomType;          
	private double pricePerNight;     
	private String availabilityStatus; 
	private int capacity;           
	private String description;
	
	public enum RoomType {
		SINGLE, DOUBLE, SUITE
	}
	
	public enum AvailabilityStatus {
		AVAILABLE, BOOKED
	}
	public Rooms() {
		super();
	}
	public Rooms(int roomId, int hotelId, int roomNumber, String roomType, double pricePerNight,
			String availabilityStatus, int capacity, String description) {
		super();
		this.roomId = roomId;
		this.hotelId = hotelId;
		this.roomNumber = roomNumber;
		this.roomType = roomType;
		this.pricePerNight = pricePerNight;
		this.availabilityStatus = availabilityStatus;
		this.capacity = capacity;
		this.description = description;
	}
	public int getRoomId() {
		return roomId;
	}
	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}
	public int getHotelId() {
		return hotelId;
	}
	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public double getPricePerNight() {
		return pricePerNight;
	}
	public void setPricePerNight(double pricePerNight) {
		this.pricePerNight = pricePerNight;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public String getAvailabilityStatus() {
		return availabilityStatus;
	}
	public void setAvailabilityStatus(String availabilityStatus) {
		this.availabilityStatus = availabilityStatus;
	}
	@Override
	public String toString() {
		return "Rooms [roomId=" + roomId + ", hotelId=" + hotelId + ", roomNumber=" + roomNumber + ", roomType="
				+ roomType + ", pricePerNight=" + pricePerNight + ", availabilityStatus=" + availabilityStatus
				+ ", capacity=" + capacity + ", description=" + description + "]";
	}

	

}
