package com.fcwebapp.pricing_service.service.impl;

import com.fcwebapp.pricing_service.dto.PricingDto;
import com.fcwebapp.pricing_service.exception.ResourceNotFoundException;
import com.fcwebapp.pricing_service.mapper.PricingMapper;
import com.fcwebapp.pricing_service.model.Pricing;
import com.fcwebapp.pricing_service.repository.PricingRepository;
import com.fcwebapp.pricing_service.service.PricingService;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PricingServiceImpl implements PricingService {
    private static final Logger LOGGER = LoggerFactory.getLogger(PricingServiceImpl.class);

    private final PricingRepository pricingRepository;

    @Override
    public PricingDto setPricing(PricingDto pricingDto) {
        Pricing pricing = (Pricing) PricingMapper.mapToPricing(pricingDto);
        Pricing savedPricing = pricingRepository.save(pricing);
        return PricingMapper.mapToPricingDto(savedPricing);
    }

    @Override
    public PricingDto getPricingForMovie(Long movieId) {
        Pricing pricing = pricingRepository.findByMovieId(movieId)
                .orElseThrow(() -> new ResourceNotFoundException("Pricing", "movieId not found", movieId));
        return PricingMapper.mapToPricingDto(pricing);
    }

    @Override
    public List<PricingDto> getAllPricing() {
        return pricingRepository.findAll().stream()
                .map(PricingMapper::mapToPricingDto)
                .toList();
    }
}
