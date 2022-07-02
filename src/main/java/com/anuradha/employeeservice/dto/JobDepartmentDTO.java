package com.anuradha.employeeservice.dto;

import com.anuradha.employeeservice.model.JobDepartment;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

@Data
public class JobDepartmentDTO {
    private Long id;
    private String name;
    private String description;

    public static List<JobDepartmentDTO> valueOf(List<JobDepartment> jobDepartments) {
        return jobDepartments.stream().map(jobDepartment -> {
            JobDepartmentDTO jobDepartmentDTO = new JobDepartmentDTO();
            BeanUtils.copyProperties(jobDepartment, jobDepartmentDTO);
            return jobDepartmentDTO;
        }).collect(Collectors.toList());
    }
}
