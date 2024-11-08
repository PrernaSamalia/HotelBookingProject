package com.hexaware.hotelbookingsystem.entity;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id; 
@Entity
public class Payments { 

	 
		@Id
	    private Integer paymentId; 
	    private Bookings booking; 
	    private Double paymentAmount; 
	    private LocalDate paymentDate; 
	    private PaymentMethod paymentMethod; 
	    private PaymentStatus paymentStatus; 
	    private String transactionId; 
	    private String remarks; 
	    private LocalDate createdAt; 

	    // Getters and Setters 

	    public Integer getPaymentId() { 

	        return paymentId; 

	    } 
	    public void setPaymentId(Integer paymentId) { 

	        this.paymentId = paymentId; 

	    } 
	    public Bookings getBooking() { 

	        return booking; 

	    } 
	    public void setBooking(Bookings booking) { 

	        this.booking = booking; 

	    } 
	    public Double getPaymentAmount() { 

	        return paymentAmount; 

	    } 
	    public void setPaymentAmount(Double paymentAmount) { 

	        this.paymentAmount = paymentAmount; 

	    } 
	    public LocalDate getPaymentDate() { 

	        return paymentDate; 

	    } 
	    public void setPaymentDate(LocalDate paymentDate) { 

	        this.paymentDate = paymentDate; 

	    } 
	    public PaymentMethod getPaymentMethod() { 

	        return paymentMethod; 

	    } 
	    public void setPaymentMethod(PaymentMethod paymentMethod) { 

	        this.paymentMethod = paymentMethod; 

	    } 
	    public PaymentStatus getPaymentStatus() { 

	        return paymentStatus; 

	    } 
	    public void setPaymentStatus(PaymentStatus paymentStatus) { 

	        this.paymentStatus = paymentStatus; 

	    } 
	    public String getTransactionId() { 

	        return transactionId; 

	    } 
	    public void setTransactionId(String transactionId) { 

	        this.transactionId = transactionId; 

	    } 
	    public String getRemarks() { 

	        return remarks; 

	    } 
	    public void setRemarks(String remarks) { 

	        this.remarks = remarks; 

	    } 
	    public LocalDate getCreatedAt() { 

	        return createdAt; 

	    } 
	    public void setCreatedAt(LocalDate createdAt) { 

	        this.createdAt = createdAt; 

	    } 
	    // Enums for paymentMethod and paymentStatus 

	    public enum PaymentMethod { 

	        CREDIT_CARD, DEBIT_CARD, PAYPAL 

	    } 

	    public enum PaymentStatus { 

	        SUCCESS, FAILED, PENDING 

	    }

		public Payments() {
			super();
		}
		public Payments(Integer paymentId, Bookings booking, Double paymentAmount, LocalDate paymentDate,
				PaymentMethod paymentMethod, PaymentStatus paymentStatus, String transactionId, String remarks,
				LocalDate createdAt) {
			super();
			this.paymentId = paymentId;
			this.booking = booking;
			this.paymentAmount = paymentAmount;
			this.paymentDate = paymentDate;
			this.paymentMethod = paymentMethod;
			this.paymentStatus = paymentStatus;
			this.transactionId = transactionId;
			this.remarks = remarks;
			this.createdAt = createdAt;
		} 
	    

}
