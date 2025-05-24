package com.fcwebapp.pricing_service.service;

import com.fcwebapp.pricing_service.dto.PricingDto;

import java.util.List;

public interface PricingService {
    PricingDto setPricing(PricingDto pricingDto);

    PricingDto getPricingForMovie(Long movieId);

    List<PricingDto> getAllPricing();

}
