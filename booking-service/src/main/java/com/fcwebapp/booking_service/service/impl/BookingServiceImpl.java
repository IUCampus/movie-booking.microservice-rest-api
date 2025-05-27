package com.fcwebapp.booking_service.service.impl;

import com.fcwebapp.booking_service.dto.BookingRequest;
import com.fcwebapp.booking_service.entity.Booking;
import com.fcwebapp.booking_service.mapper.BookingMapper;
import com.fcwebapp.booking_service.repository.BookingRepository;
import com.fcwebapp.booking_service.service.BookingService;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BookingServiceImpl implements BookingService {
    private static final Logger LOGGER = LoggerFactory.getLogger(BookingServiceImpl.class);

    private final BookingRepository bookingRepository;

    @Override
    public BookingRequest createBooking(BookingRequest bookingRequest) {
        Booking booking = new BookingMapper().mapToBooking(bookingRequest);
        Booking savedBooking = bookingRepository.save(booking);
        return BookingMapper.mapToBookingRequest(savedBooking);
    }

    @Override
    public List<BookingRequest> getAllBooking() {
        return bookingRepository.findAll().stream()
                .map(BookingMapper::mapToBookingRequest)
                .toList();
    }
}
