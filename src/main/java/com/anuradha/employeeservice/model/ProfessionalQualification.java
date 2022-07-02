package com.anuradha.employeeservice.model;

import com.anuradha.employeeservice.dto.QualificationDTO;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import java.util.Date;

@Data
public class ProfessionalQualification extends Qualification {
    private String company;
    private String positionHeld;
    private Date startDate;
    private Date endDate;

    public static ProfessionalQualification valueOf(QualificationDTO qualificationDTO) {
        ProfessionalQualification professionalQualification = new ProfessionalQualification();
        BeanUtils.copyProperties(qualificationDTO, professionalQualification);
        return professionalQualification;
    }
}
