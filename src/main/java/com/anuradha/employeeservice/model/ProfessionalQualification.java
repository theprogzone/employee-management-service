package com.anuradha.employeeservice.model;

import com.anuradha.employeeservice.dto.QualificationDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.beans.BeanUtils;

import javax.persistence.Entity;
import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
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
