package com.anuradha.employeeservice.service.implementation;

import com.anuradha.employeeservice.dto.SalaryDetailsDTO;
import com.anuradha.employeeservice.model.SalaryDetails;
import com.anuradha.employeeservice.repository.SalaryDetailsRepository;
import com.anuradha.employeeservice.service.SalaryDetailsService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class SalaryDetailsServiceImpl implements SalaryDetailsService {

    private final SalaryDetailsRepository salaryDetailsRepository;

    @Override
    public void save(SalaryDetailsDTO salaryDetailsDTO) {
        log.info("salaryDetailsDTO => {}", salaryDetailsDTO);
        salaryDetailsRepository.save(SalaryDetails.valueOf(salaryDetailsDTO));
    }

    @Override
    public List<SalaryDetailsDTO> findAll() {
        return SalaryDetailsDTO.valueOf(salaryDetailsRepository.findAll());
    }
}
