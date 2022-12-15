package com.alibknc.hrmanagementapp.client.dto.response;

import com.alibknc.hrmanagementapp.data.entity.enums.PermitType;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@Builder
public class PermitDto implements Serializable {

    UUID id;

    @JsonFormat(pattern = "dd/MM/yyyy")
    @JsonProperty("start-date")
    LocalDate startDate;

    @JsonFormat(pattern = "dd/MM/yyyy")
    @JsonProperty("finish-date")
    LocalDate finishDate;

    String details;

    @Enumerated(value = EnumType.STRING)
    PermitType permitType;

    EmployeeDto employee;
}
