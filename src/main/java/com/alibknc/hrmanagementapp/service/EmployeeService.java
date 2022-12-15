package com.alibknc.hrmanagementapp.service;

import com.alibknc.hrmanagementapp.client.dto.mapper.EmployeeMapper;
import com.alibknc.hrmanagementapp.client.dto.response.EmployeeDto;
import com.alibknc.hrmanagementapp.data.entity.Employee;
import com.alibknc.hrmanagementapp.data.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Slf4j
@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;

    @Transactional(readOnly = true)
    public List<EmployeeDto> getAllEmployees() {
        List<Employee> employeeList = employeeRepository.findAllEmployees();

        return employeeList.stream()
                .map(employeeMapper::toEmployeeDto)
                .collect(Collectors.toList());
    }

    public EmployeeDto createEmployee(EmployeeDto employee) {
        Employee result = employeeRepository.save(employeeMapper.toEmployee(employee));
        return employeeMapper.toEmployeeDto(result);
    }

    public void deleteEmployee(UUID id) {
        employeeRepository.deleteById(id);
    }
}
