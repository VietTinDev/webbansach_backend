package com.viettin.webbansach_backend.repository;

import com.viettin.webbansach_backend.entity.PaymentMethod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentMethodRepository extends JpaRepository<PaymentMethod,Integer> {
}
