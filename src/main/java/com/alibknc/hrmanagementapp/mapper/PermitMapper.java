package com.alibknc.hrmanagementapp.mapper;

import com.alibknc.hrmanagementapp.client.dto.response.PermitDto;
import com.alibknc.hrmanagementapp.model.Permit;
import org.mapstruct.Mapper;

@Mapper(implementationName = "PermitMapperImpl", componentModel = "spring")
public interface PermitMapper {

    PermitDto toPermitDto(Permit permit);
}
