package com.anuradha.employeeservice.model;

import com.anuradha.employeeservice.dto.QualificationDTO;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import java.util.Date;

@Data
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
