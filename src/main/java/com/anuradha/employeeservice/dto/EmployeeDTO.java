package com.anuradha.employeeservice.dto;

import com.anuradha.employeeservice.model.Employee;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

@Data
public class EmployeeDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private JobDepartmentDTO jobDepartment;

    public static List<EmployeeDTO> valueOf(List<Employee> employees) {
        return employees.stream().map(employee -> {
            EmployeeDTO employeeDTO = new EmployeeDTO();
            BeanUtils.copyProperties(employee, employeeDTO);
            return employeeDTO;
        }).collect(Collectors.toList());
    }
}
