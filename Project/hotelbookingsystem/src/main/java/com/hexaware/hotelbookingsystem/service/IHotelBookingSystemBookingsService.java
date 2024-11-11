
package com.hexaware.hotelbookingsystem.service;

import com.hexaware.hotelbookingsystem.entity.Bookings;
import java.util.List;

public interface IHotelBookingSystemBookingsService {
    Bookings createBooking(Bookings booking);
    Bookings getBookingById(Integer bookingId);
    List<Bookings> getBookingsByUserId(Integer userId);
    List<Bookings> getBookingsByHotelId(Integer hotelId);
    Bookings updateBooking(Integer bookingId, Bookings updatedBooking);
    int cancelBooking(Integer bookingId);
}
