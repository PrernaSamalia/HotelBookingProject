package com.hexaware.hotelbookingsystem.service;

import com.hexaware.hotelbookingsystem.entity.Payments;
import java.util.List;

public interface  {
    Payments processPayment(Payments payment);
    Payments getPaymentById(Integer paymentId);
    List<Payments> getPaymentsByUserId(Integer userId);
    List<Payments> getPaymentsByBookingId(Integer bookingId);
    Payments updatePaymentStatus(Integer paymentId, Payments.PaymentStatus status);
}
