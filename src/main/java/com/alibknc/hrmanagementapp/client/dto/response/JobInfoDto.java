package com.alibknc.hrmanagementapp.client.dto.response;

import com.alibknc.hrmanagementapp.data.entity.enums.Department;
import com.alibknc.hrmanagementapp.data.entity.enums.Level;
import com.alibknc.hrmanagementapp.data.entity.enums.Position;
import com.alibknc.hrmanagementapp.data.entity.enums.WorkType;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@Builder
public class JobInfoDto implements Serializable {

    Department department;

    Level level;

    Position position;

    WorkType workType;

    @JsonFormat(pattern = "dd/MM/yyyy")
    @JsonProperty("start-date")
    LocalDate startDate;

    int salary;

}
