package com.fcwebapp.booking_service.mapper;

import java.util.List;

public class BookingMapper {
    public static BookingRequest mapToBookingRequest(Booking booking){
        BookingRequest bookingRequest = new BookingRequest(
                booking.getShowtimeId(),
                String.join(",", booking.getSeatNumbers())
        );
    return bookingRequest;
    }

    public static Booking mapToBooking(BookingRequest bookingRequest){
        Booking booking = new Booking();
        booking.setShowtimeId(bookingRequest.getShowtimeId());
        booking.setSeatNumbers(List.of(bookingRequest.getSeats().split(",")));
        booking.setConfirmed(false);
        return booking;
    }
}
