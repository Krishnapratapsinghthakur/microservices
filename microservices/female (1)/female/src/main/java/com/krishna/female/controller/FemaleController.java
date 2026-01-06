package com.krishna.female.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/FEMALE/")
@RestController
public class FemaleController {
    @GetMapping
    public ResponseEntity<String> getMapping()
    {
        return ResponseEntity.ok("hii form female server");

    }

}
