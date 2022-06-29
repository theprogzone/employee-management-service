package com.anuradha.employeeservice.repository;

import com.anuradha.employeeservice.model.JobDepartment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobDepartmentRepository extends JpaRepository<JobDepartment, Long> {
}
