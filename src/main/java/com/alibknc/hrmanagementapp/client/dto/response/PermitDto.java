package com.alibknc.hrmanagementapp.client.dto.response;

import com.alibknc.hrmanagementapp.model.enums.PermitType;
import lombok.Builder;
import lombok.Data;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDate;

@Data
@Builder
public class PermitDto {

    LocalDate startDate;

    LocalDate finishDate;

    String details;

    @Enumerated(value = EnumType.STRING)
    PermitType permitType;
}
