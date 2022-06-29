package com.anuradha.employeeservice.dto;

import lombok.Data;

import java.util.Date;

@Data
public class QualificationDTO {
    private Long id;
    private String type;
    private String description;
    private String institute;
    private String qualification;
    private Date startDate;
    private Date endDate;
    private String company;
    private String positionHeld;
}
