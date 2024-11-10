package com.hexaware.hotelbookingsystem.service;

import java.util.List;

import com.hexaware.hotelbookingsystem.entity.Users;

public interface IHotelBookingSystemUsersService {
	
	List<Users> addUsers();
	
	List<Users> getAllUsers();
	
     int updateUsers(Users user);
	 
	 int getUsers(int userId );
	 
	 int removeFromUsers(int userId);
	
	

}
