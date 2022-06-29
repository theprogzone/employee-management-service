package com.anuradha.employeeservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee/api/v1")
public class EmployeeController {

    @GetMapping("/all")
    public ResponseEntity<?> getAllEmployees() {
        return new ResponseEntity<String>(null);
    }
}
