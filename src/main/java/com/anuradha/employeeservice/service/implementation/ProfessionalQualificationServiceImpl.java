package com.anuradha.employeeservice.service.implementation;

import com.anuradha.employeeservice.dto.QualificationDTO;
import com.anuradha.employeeservice.model.ProfessionalQualification;
import com.anuradha.employeeservice.repository.ProfessionalQualificationRepository;
import com.anuradha.employeeservice.service.ProfessionalQualificationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class ProfessionalQualificationServiceImpl implements ProfessionalQualificationService {

    private final ProfessionalQualificationRepository professionalQualificationRepository;

    @Override
    public void save(QualificationDTO qualificationDTO) {
        log.info("qualificationDTO => {}", qualificationDTO);
        professionalQualificationRepository.save(ProfessionalQualification.valueOf(qualificationDTO));
    }
}
