package com.example.gokart.repository;

import com.example.gokart.model.AppliedRider;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppliedRidersRepository extends JpaRepository<AppliedRider, Long> {

    //ist<AppliedRiders> findAll();
}
