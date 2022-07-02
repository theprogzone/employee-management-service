package com.anuradha.employeeservice.service.implementation;

import com.anuradha.employeeservice.dto.QualificationDTO;
import com.anuradha.employeeservice.model.AcademicQualification;
import com.anuradha.employeeservice.repository.AcademicQualificationRepository;
import com.anuradha.employeeservice.service.AcademicQualificationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class AcademicQualificationServiceImpl implements AcademicQualificationService {

    private final AcademicQualificationRepository academicQualificationRepository;

    @Override
    public void save(QualificationDTO qualificationDTO) {
        log.info("qualificationDTO => {}", qualificationDTO);
        academicQualificationRepository.save(AcademicQualification.valueOf(qualificationDTO));
    }
}
