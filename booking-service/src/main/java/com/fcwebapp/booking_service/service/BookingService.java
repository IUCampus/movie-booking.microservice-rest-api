package com.fcwebapp.booking_service.service;


import java.util.List;

public interface BookingService {
    BookingRequest createBooking(BookingRequest bookingRequest);

    List<BookingRequest> getAllBooking();

}
