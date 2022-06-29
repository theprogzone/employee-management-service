package com.anuradha.employeeservice.repository;

import com.anuradha.employeeservice.model.SalaryDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaryDetailsRepository extends JpaRepository<SalaryDetails, Long> {
}
