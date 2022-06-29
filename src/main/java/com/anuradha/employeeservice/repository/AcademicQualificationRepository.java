package com.anuradha.employeeservice.repository;

import com.anuradha.employeeservice.model.AcademicQualification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcademicQualificationRepository extends JpaRepository<AcademicQualification, Long> {
}
