package com.viettin.webbansach_backend.repository;

import com.viettin.webbansach_backend.entity.ShippingMethod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShippingMethodRepository extends JpaRepository<ShippingMethod,Integer> {
}
