package com.anuradha.employeeservice.service;

import com.anuradha.employeeservice.dto.SalaryDetailsDTO;

import java.util.List;

public interface SalaryDetailsService {
    void save(SalaryDetailsDTO salaryDetailsDTO);
    List<SalaryDetailsDTO> findAll();
}
