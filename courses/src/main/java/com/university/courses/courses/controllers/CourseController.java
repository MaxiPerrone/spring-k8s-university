package com.university.courses.courses.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

    @GetMapping("/")
    public ResponseEntity<?> list() {
        return ResponseEntity.ok(List.of("Artificial Intelligence", "AWS developer"));
    }
}
