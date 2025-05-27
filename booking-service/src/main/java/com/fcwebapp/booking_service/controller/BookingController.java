package com.fcwebapp.booking_service.controller;

import com.fcwebapp.booking_service.config.BookingServiceProxy;
import com.fcwebapp.booking_service.dto.BookingRequest;
import com.fcwebapp.booking_service.service.impl.BookingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.fcwebapp.pricing_service.dto.PricingDto;

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
    public ResponseEntity<PricingDto> getMovieBooking(@PathVariable Long movieId) {
        PricingDto pricingResponse = bookingServiceProxy.getPricingForMovie(movieId);
        return pricingResponse == null ?
                ResponseEntity.notFound().build() : ResponseEntity.ok(pricingResponse);
    }
}