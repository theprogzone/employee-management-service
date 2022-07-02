package com.anuradha.employeeservice.service.implementation;

import com.anuradha.employeeservice.dto.JobDepartmentDTO;
import com.anuradha.employeeservice.model.JobDepartment;
import com.anuradha.employeeservice.repository.JobDepartmentRepository;
import com.anuradha.employeeservice.service.JobDepartmentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class JobDepartmentServiceImpl implements JobDepartmentService {

    private final JobDepartmentRepository jobDepartmentRepository;

    @Override
    public void save(JobDepartmentDTO jobDepartmentDTO) {
        log.info("jobDepartmentDTO => {}", jobDepartmentDTO);
        jobDepartmentRepository.save(JobDepartment.valueOf(jobDepartmentDTO));
    }

    @Override
    public List<JobDepartmentDTO> findAll() {
        return JobDepartmentDTO.valueOf(jobDepartmentRepository.findAll());
    }

    @Override
    public void delete(Long id) {
        log.info("jobDepartment id => {}", id);
        jobDepartmentRepository.deleteById(id);
    }
}
