package com.anuradha.employeeservice.model;

import javax.persistence.*;

@Entity
public abstract class Qualification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    protected String type;
    protected String description;
    @ManyToOne
    @JoinColumn(name = "employee_id")
    protected Employee employee;
}
