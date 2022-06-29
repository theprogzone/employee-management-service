package com.anuradha.employeeservice.model;

import lombok.Data;

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
}
