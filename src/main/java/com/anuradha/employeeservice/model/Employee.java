package com.anuradha.employeeservice.model;

import com.anuradha.employeeservice.dto.EmployeeDTO;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import javax.persistence.*;

@Data
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    @OneToOne
    @JoinColumn(name = "job_id")
    private JobDepartment jobDepartment;

    public static Employee valueOf(EmployeeDTO employeeDTO) {
        Employee employee = new Employee();
        BeanUtils.copyProperties(employeeDTO, employee);
        return employee;
    }
}
