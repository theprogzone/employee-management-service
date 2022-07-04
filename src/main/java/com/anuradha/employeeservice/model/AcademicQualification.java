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
public class AcademicQualification extends Qualification {
    private String institute;
    private String qualification;
    private Date startDate;
    private Date endDate;

    public static AcademicQualification valueOf(QualificationDTO qualificationDTO) {
        AcademicQualification academicQualification = new AcademicQualification();
        BeanUtils.copyProperties(qualificationDTO, academicQualification);
        return academicQualification;
    }
}
