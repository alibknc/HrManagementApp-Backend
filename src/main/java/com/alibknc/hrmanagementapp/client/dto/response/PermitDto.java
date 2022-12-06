package com.alibknc.hrmanagementapp.client.dto.response;

import com.alibknc.hrmanagementapp.data.entity.enums.PermitType;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDate;

@Data
@Builder
public class PermitDto {

    @JsonFormat(pattern = "dd/MM/yyyy")
    @JsonProperty("start-date")
    LocalDate startDate;

    @JsonFormat(pattern = "dd/MM/yyyy")
    @JsonProperty("finish-date")
    LocalDate finishDate;

    String details;

    @Enumerated(value = EnumType.STRING)
    PermitType permitType;
}
