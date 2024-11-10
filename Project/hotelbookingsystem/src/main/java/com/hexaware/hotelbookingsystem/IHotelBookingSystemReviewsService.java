package com.hexaware.hotelbookingsystem.service;

import com.hexaware.hotelbookingsystem.entity.Reviews;
import java.util.List;

public interface IHotelBookingSystemReviewsService {
    Reviews addReview(Reviews review);
    Reviews getReviewById(Integer reviewId);
    List<Reviews> getReviewsByHotelId(Integer hotelId);
    List<Reviews> getReviewsByUserId(Integer userId);
    Reviews updateReview(Integer reviewId, Reviews updatedReview);
    void deleteReview(Integer reviewId);
}
