package com.viettin.webbansach_backend.repository;

import com.viettin.webbansach_backend.entity.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetails,Integer> {
}
