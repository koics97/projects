package com.example.gokart.controller;

import com.example.gokart.model.AppliedRider;
import com.example.gokart.service.WebService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@Slf4j
public class WebRestController {

    private final WebService webService;

    @PostMapping("/submitForm")
    void addNewRider(@RequestBody AppliedRider rider) {
        log.info("Adding new rider: {}", rider);
        webService.addNewRider(rider);
    }

}
