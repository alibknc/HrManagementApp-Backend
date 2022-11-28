package com.alibknc.hrmanagementapp.service;

import com.alibknc.hrmanagementapp.client.dto.response.EmployeeDto;
import com.alibknc.hrmanagementapp.mapper.EmployeeMapper;
import com.alibknc.hrmanagementapp.model.Employee;
import com.alibknc.hrmanagementapp.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Slf4j
@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;

    public List<EmployeeDto> getAllEmployees() {
        List<Employee> employeeList = employeeRepository.findAll();

        return employeeList.stream()
                .map(employeeMapper::toEmployeeDto)
                .collect(Collectors.toList());
    }
}
