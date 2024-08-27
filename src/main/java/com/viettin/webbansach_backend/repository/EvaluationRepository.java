package com.viettin.webbansach_backend.repository;

import com.viettin.webbansach_backend.entity.Evaluation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EvaluationRepository extends JpaRepository<Evaluation,Long> {
}
