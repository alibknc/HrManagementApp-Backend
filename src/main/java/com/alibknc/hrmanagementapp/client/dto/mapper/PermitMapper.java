package com.alibknc.hrmanagementapp.client.dto.mapper;

import com.alibknc.hrmanagementapp.client.dto.response.PermitDto;
import com.alibknc.hrmanagementapp.data.entity.Permit;
import org.mapstruct.Mapper;

@Mapper(implementationName = "PermitMapperImpl", componentModel = "spring")
public interface PermitMapper {

    PermitDto toPermitDto(Permit permit);

    Permit toPermit(PermitDto permitDto);
}
