package com.fcwebapp.booking_service.service;


import com.fcwebapp.booking_service.dto.BookingRequest;

import java.util.List;

public interface BookingService {
    BookingRequest createBooking(BookingRequest bookingRequest);

    List<BookingRequest> getAllBooking();

}
