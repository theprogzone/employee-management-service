package com.anuradha.employeeservice.controller;

import com.anuradha.employeeservice.dto.EmployeeDTO;
import com.anuradha.employeeservice.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employee")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping("/all")
    public ResponseEntity<?> getAllEmployees() {
        return new ResponseEntity<List<EmployeeDTO>>(employeeService.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> createEmployee(@RequestBody EmployeeDTO employeeDTO) {
        employeeService.save(employeeDTO);
        return new ResponseEntity<String>("success", HttpStatus.OK);
    }
}
