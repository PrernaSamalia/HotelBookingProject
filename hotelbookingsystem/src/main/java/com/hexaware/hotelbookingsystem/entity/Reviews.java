package com.hexaware.hotelbookingsystem.entity;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id; 
@Entity
public class Reviews { 
	@Id
    private Integer reviewId; 

    private Users user; 

    private Hotels hotel; 

    private Integer rating; 

    private String reviewTitle; 

    private String comments; 

    private LocalDateTime createdAt; 

    private LocalDateTime updatedAt; 

    // Getters and Setters 

    public Integer getReviewId() { 

        return reviewId; 

    } 

    public void setReviewId(Integer reviewId) { 

        this.reviewId = reviewId; 

    } 

 

    public Users getUser() { 

        return user; 

    } 

 

    public void setUser(Users user) { 

        this.user = user; 

    } 

 

    public Hotels getHotel() { 

        return hotel; 

    } 

 

    public void setHotel(Hotels hotel) { 

        this.hotel = hotel; 

    } 

 

    public Integer getRating() { 

        return rating; 

    } 

 

    public void setRating(Integer rating) { 

        this.rating = rating; 

    } 

 

    public String getReviewTitle() { 

        return reviewTitle; 

    } 

 

    public void setReviewTitle(String reviewTitle) { 

        this.reviewTitle = reviewTitle; 

    } 

 

    public String getComments() { 

        return comments; 

    } 

 

    public void setComments(String comments) { 

        this.comments = comments; 

    } 

 

    public LocalDateTime getCreatedAt() { 

        return createdAt; 

    } 

 

    public void setCreatedAt(LocalDateTime createdAt) { 

        this.createdAt = createdAt; 

    } 

 

    public LocalDateTime getUpdatedAt() { 

        return updatedAt; 

    } 

 

    public void setUpdatedAt(LocalDateTime updatedAt) { 

        this.updatedAt = updatedAt; 

    } 

} 


 