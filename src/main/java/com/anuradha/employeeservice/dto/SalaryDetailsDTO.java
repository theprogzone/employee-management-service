package com.anuradha.employeeservice.dto;

import com.anuradha.employeeservice.model.SalaryDetails;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class SalaryDetailsDTO {
    private Long id;
    private BigDecimal basicSalary;
    private BigDecimal allowance;
    private BigDecimal bonus;
    private boolean annual;
    private EmployeeDTO employee;

    public static List<SalaryDetailsDTO> valueOf(List<SalaryDetails> salaryDetailsList) {
        return salaryDetailsList.stream().map(salaryDetails -> {
            SalaryDetailsDTO salaryDetailsDTO = new SalaryDetailsDTO();
            BeanUtils.copyProperties(salaryDetails, salaryDetailsDTO);
            return salaryDetailsDTO;
        }).collect(Collectors.toList());
    }
}
