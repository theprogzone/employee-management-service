package com.anuradha.employeeservice.service.implementation;

import com.anuradha.employeeservice.dto.EmployeeDTO;
import com.anuradha.employeeservice.model.Employee;
import com.anuradha.employeeservice.repository.EmployeeRepository;
import com.anuradha.employeeservice.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Override
    public void save(EmployeeDTO employeeDTO) {
        log.info("employeeDTO => {}", employeeDTO);
        employeeRepository.save(Employee.valueOf(employeeDTO));
    }

    @Override
    public List<EmployeeDTO> findAll() {
        return EmployeeDTO.valueOf(employeeRepository.findAll());
    }

    @Override
    public void delete(Long id) {
        log.info("employee id => {}", id);
        employeeRepository.deleteById(id);
    }
}
