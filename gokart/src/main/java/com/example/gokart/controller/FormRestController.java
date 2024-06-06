package com.example.gokart.controller;

import com.example.gokart.model.AppliedRider;
import com.example.gokart.service.FormService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@Slf4j
public class FormRestController {

    private final FormService formService;

    //@PostMapping("/submitForm")
    @RequestMapping(method = RequestMethod.POST, value = "/submitForm")
    void addNewRider(@RequestBody AppliedRider rider) {
        log.info("Adding new rider: {}", rider);
        formService.addNewRider(rider);
    }

}
