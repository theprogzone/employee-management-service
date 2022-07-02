package com.anuradha.employeeservice.controller;

import com.anuradha.employeeservice.dto.JobDepartmentDTO;
import com.anuradha.employeeservice.service.JobDepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/job")
@RequiredArgsConstructor
public class JobDepartmentController {

    private final JobDepartmentService jobDepartmentService;

    @GetMapping("/all")
    public ResponseEntity<?> getAllJobDepartments() {
        return new ResponseEntity<List<JobDepartmentDTO>>(jobDepartmentService.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> createJobDepartment(@RequestBody JobDepartmentDTO jobDepartmentDTO) {
        jobDepartmentService.save(jobDepartmentDTO);
        return new ResponseEntity<>("success", HttpStatus.OK);
    }
}
