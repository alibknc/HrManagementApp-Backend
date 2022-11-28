package com.alibknc.hrmanagementapp.mapper;

import com.alibknc.hrmanagementapp.client.dto.response.EmployeeDto;
import com.alibknc.hrmanagementapp.model.Employee;
import org.mapstruct.Mapper;

@Mapper(implementationName = "EmployeeMapperImpl", componentModel = "spring")
public interface EmployeeMapper {

    EmployeeDto toEmployeeDto(Employee employee);
}
