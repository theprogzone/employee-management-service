package com.anuradha.employeeservice.service;

import com.anuradha.employeeservice.dto.EmployeeDTO;

import java.util.List;

public interface EmployeeService {
    void save(EmployeeDTO employeeDTO);
    List<EmployeeDTO> findAll();
    void delete(Long id);
}
