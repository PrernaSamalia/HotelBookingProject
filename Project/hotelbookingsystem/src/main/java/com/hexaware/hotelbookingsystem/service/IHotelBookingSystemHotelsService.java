package com.hexaware.hotelbookingsystem.service;

import java.util.List;

import com.hexaware.hotelbookingsystem.entity.Hotels;

public interface IHotelBookingSystemHotelsService {
	
    List<Hotels> addHotels();
	
	List<Hotels> getAllHotels();

	int updateHotels(Hotels hotel);
	 
	int getHotels(int hotelId );
	 
	int deleteHotels(int hotelId);

}
