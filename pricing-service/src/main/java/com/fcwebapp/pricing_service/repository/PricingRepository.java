package com.fcwebapp.pricing_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fcwebapp.pricing_service.model.Pricing;

import java.util.Optional;

public interface PricingRepository extends JpaRepository<Pricing, Long> {
    Optional<Pricing> findByMovieId(Long movieId);
}
