package com.anuradha.employeeservice.repository;

import com.anuradha.employeeservice.model.ProfessionalQualification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessionalQualificationRepository extends JpaRepository<ProfessionalQualification, Long> {
}
