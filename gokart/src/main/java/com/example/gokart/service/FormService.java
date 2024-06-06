package com.example.gokart.service;

import com.example.gokart.model.AppliedRider;
import com.example.gokart.repository.AppliedRidersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FormService {

    private final AppliedRidersRepository appliedRidersRepository;

    public List<AppliedRider> getAllRiders() {
        return appliedRidersRepository.findAll();
    }

    public void addNewRider(AppliedRider rider) {
        appliedRidersRepository.save(rider);
    }
}
