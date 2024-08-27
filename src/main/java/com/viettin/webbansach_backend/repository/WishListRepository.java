package com.viettin.webbansach_backend.repository;

import com.viettin.webbansach_backend.entity.WishList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WishListRepository extends JpaRepository<WishList,Integer> {
}
