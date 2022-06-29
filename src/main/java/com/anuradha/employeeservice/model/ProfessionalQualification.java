package com.anuradha.employeeservice.model;

import lombok.Data;

import java.util.Date;

@Data
public class ProfessionalQualification extends Qualification {
    private String company;
    private String positionHeld;
    private Date startDate;
    private Date endDate;
}
