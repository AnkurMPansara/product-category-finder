package com.ankur.prodcat.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ankur.prodcat.model.PingResponse;

@RestController
public class PingController {

    @GetMapping("/ping")
    public PingResponse ping() {
        return new PingResponse("Success");
    }
}