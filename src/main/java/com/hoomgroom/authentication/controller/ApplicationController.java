package com.hoomgroom.authentication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/demo")
public class ApplicationController {

    @GetMapping
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello World!");
    }
}