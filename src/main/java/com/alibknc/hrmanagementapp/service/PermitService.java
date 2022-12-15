package com.alibknc.hrmanagementapp.service;

import com.alibknc.hrmanagementapp.client.dto.mapper.PermitMapper;
import com.alibknc.hrmanagementapp.client.dto.request.CreatePermitRequest;
import com.alibknc.hrmanagementapp.client.dto.response.PermitDto;
import com.alibknc.hrmanagementapp.data.entity.Employee;
import com.alibknc.hrmanagementapp.data.entity.Permit;
import com.alibknc.hrmanagementapp.data.repository.EmployeeRepository;
import com.alibknc.hrmanagementapp.data.repository.PermitRepository;
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
public class PermitService {

    private final PermitRepository permitRepository;
    private final PermitMapper permitMapper;
    private final EmployeeRepository employeeRepository;

    @Transactional(readOnly = true)
    public List<PermitDto> getAllPermits() {
        List<Permit> permitList = permitRepository.findAllPermits();

        return permitList.stream()
                .map(permitMapper::toPermitDto)
                .collect(Collectors.toList());
    }

    public void createPermit(CreatePermitRequest request) {
        Permit permit = permitMapper.toPermit(request);
        Employee employee = employeeRepository.findById(request.getEmployeeId())
                .orElseThrow(() -> new RuntimeException("employee not found"));
        permit.setEmployee(employee);
        permitRepository.save(permit);
    }

    public void deletePermit(UUID id) {
        permitRepository.deleteById(id);
    }
}
