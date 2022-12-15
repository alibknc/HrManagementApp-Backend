package com.alibknc.hrmanagementapp.client.dto.mapper;

import com.alibknc.hrmanagementapp.client.dto.request.CreatePermitRequest;
import com.alibknc.hrmanagementapp.client.dto.response.PermitDto;
import com.alibknc.hrmanagementapp.data.entity.Permit;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(implementationName = "PermitMapperImpl", componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PermitMapper {

    PermitDto toPermitDto(Permit permit);

    Permit toPermit(CreatePermitRequest permitRequest);

}
