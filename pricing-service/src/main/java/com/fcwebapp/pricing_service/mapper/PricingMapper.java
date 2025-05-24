package com.fcwebapp.pricing_service.mapper;

import com.fcwebapp.pricing_service.dto.PricingDto;
import com.fcwebapp.pricing_service.model.Pricing;

public class PricingMapper {
    public static PricingDto mapToPricingDto(Pricing pricing){
        PricingDto pricingDto = new PricingDto(
                pricing.getId(),
                pricing.getMovieId(),
                pricing.getBasePrice(),
                pricing.getDiscount(),
                pricing.getOfferDescription()
        );
    return pricingDto;
    }

    public static Pricing mapToPricing(PricingDto pricingDto){
        Pricing pricing = new Pricing(
                pricingDto.getId(),
                pricingDto.getMovieId(),
                pricingDto.getBasePrice(),
                pricingDto.getDiscount(),
                pricingDto.getOfferDescription()
        );
        return pricing;
    }
}
