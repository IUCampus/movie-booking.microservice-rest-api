package com.fcwebapp.booking_service.config;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.fcwebapp.pricing_service.dto.PricingDto;







@FeignClient(name = "pricing-service", url = "http://localhost:8084")
public interface BookingServiceProxy {
    @GetMapping("/movie/{movieId}")
    public PricingDto getPricingForMovie(@PathVariable Long movieId);
}
