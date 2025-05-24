package com.fcwebapp.pricing_service.controller;

import com.fcwebapp.pricing_service.dto.PricingDto;
import com.fcwebapp.pricing_service.service.impl.PricingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PricingController {
    @Autowired private PricingServiceImpl pricingService;

    @PostMapping
    public ResponseEntity<PricingDto> setPricing(@RequestBody PricingDto pricingDto) {
        return ResponseEntity.ok(pricingService.setPricing(pricingDto));
    }

    @GetMapping("/movie/{movieId}")
    public ResponseEntity<PricingDto> getPricingForMovie(@PathVariable Long movieId) {
        return ResponseEntity.ok(pricingService.getPricingForMovie(movieId));
    }

    @GetMapping("/allPricing")
    public ResponseEntity<List<PricingDto>> getAllPricing() {
        return ResponseEntity.ok(pricingService.getAllPricing());
    }

}

