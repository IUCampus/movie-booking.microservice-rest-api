package com.fcwebapp.booking_service.repository;

import com.fcwebapp.booking_service.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {

}
