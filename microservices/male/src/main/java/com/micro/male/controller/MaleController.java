package com.micro.male.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/MALE/")
public class MaleController {
    @GetMapping
    public ResponseEntity<String> getMapping()
    {
        ResponseEntity<String> hiiFromMaleServer = ResponseEntity.ok("hii from male server");
        return hiiFromMaleServer;
    }
}
