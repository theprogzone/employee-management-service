package com.anuradha.employeeservice.model;

import com.anuradha.employeeservice.dto.JobDepartmentDTO;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class JobDepartment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;

    public static JobDepartment valueOf(JobDepartmentDTO jobDepartmentDTO) {
        JobDepartment jobDepartment = new JobDepartment();
        BeanUtils.copyProperties(jobDepartmentDTO, jobDepartment);
        return jobDepartment;
    }
}
