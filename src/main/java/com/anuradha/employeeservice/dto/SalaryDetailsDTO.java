package com.anuradha.employeeservice.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class SalaryDetailsDTO {
    private Long id;
    private BigDecimal basicSalary;
    private BigDecimal allowance;
    private BigDecimal bonus;
    private boolean annual;
    private EmployeeDTO employee;
}
