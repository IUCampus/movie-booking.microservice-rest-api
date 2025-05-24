package com.fcwebapp.booking_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/booking")
public class BookingController {

    @Autowired private BookingServiceProxy bookingServiceProxy;

    private final BookingServiceImpl bookingService;

    public BookingController(BookingServiceImpl bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping("create")
    public ResponseEntity<BookingRequest> setPricing(@RequestBody BookingRequest bookingRequest) {
        return ResponseEntity.ok(bookingService.createBooking(bookingRequest));
    }

    @GetMapping("book")
    public ResponseEntity<List<BookingRequest>> getAllBookings() {
        return ResponseEntity.ok(bookingService.getAllBooking());
    }

    @GetMapping("{movieId}")
    public ResponseEntity<BookingRequest> getMovieBooking(@PathVariable Long movieId) {
        BookingRequest bookingRequest = bookingServiceProxy.getPricingForMovie(movieId);
        return bookingRequest == null ?
                ResponseEntity.notFound().build() : ResponseEntity.ok(bookingRequest);
    }
}

