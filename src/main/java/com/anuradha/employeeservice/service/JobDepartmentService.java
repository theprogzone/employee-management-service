package com.anuradha.employeeservice.service;

import com.anuradha.employeeservice.dto.JobDepartmentDTO;

import java.util.List;

public interface JobDepartmentService {
    void save(JobDepartmentDTO jobDepartmentDTO);
    List<JobDepartmentDTO> findAll();
    void delete(Long id);
}
