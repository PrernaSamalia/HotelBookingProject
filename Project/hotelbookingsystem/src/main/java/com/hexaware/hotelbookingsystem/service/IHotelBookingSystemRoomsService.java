package com.hexaware.hotelbookingsystem.service;

import java.util.List;

import com.hexaware.hotelbookingsystem.entity.Rooms;

public interface IHotelBookingSystemRoomsService {
	
    List<Rooms> addRooms();
	
	List<Rooms> getAllRooms();
	
	int updateRooms(Rooms room);
	 
	int getRooms(int roomId );
	 
	int deleteRooms(int roomId);
	

}
