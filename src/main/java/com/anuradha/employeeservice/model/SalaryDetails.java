package com.anuradha.employeeservice.model;

import com.anuradha.employeeservice.dto.SalaryDetailsDTO;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
public class SalaryDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal basicSalary;
    private BigDecimal allowance;
    private BigDecimal bonus;
    private boolean annual;
    @OneToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    public static SalaryDetails valueOf(SalaryDetailsDTO salaryDetailsDTO) {
        SalaryDetails salaryDetails = new SalaryDetails();
        BeanUtils.copyProperties(salaryDetailsDTO, salaryDetails);
        return salaryDetails;
    }
}
