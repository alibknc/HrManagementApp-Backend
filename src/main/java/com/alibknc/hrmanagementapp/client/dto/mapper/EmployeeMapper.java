package com.alibknc.hrmanagementapp.client.dto.mapper;

import com.alibknc.hrmanagementapp.client.dto.response.EmployeeDto;
import com.alibknc.hrmanagementapp.data.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(implementationName = "EmployeeMapperImpl", componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface EmployeeMapper {

    EmployeeDto toEmployeeDto(Employee employee);

    Employee toEmployee(EmployeeDto employeeDto);
}
