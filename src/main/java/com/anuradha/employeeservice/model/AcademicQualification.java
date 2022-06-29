package com.anuradha.employeeservice.model;

import lombok.Data;

import java.util.Date;

@Data
public class AcademicQualification extends Qualification {
    private String institute;
    private String qualification;
    private Date startDate;
    private Date endDate;
}
