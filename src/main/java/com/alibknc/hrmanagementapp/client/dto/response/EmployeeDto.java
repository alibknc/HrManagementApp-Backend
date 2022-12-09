package com.alibknc.hrmanagementapp.client.dto.response;

import com.alibknc.hrmanagementapp.data.entity.ContactInfo;
import com.alibknc.hrmanagementapp.data.entity.JobInfo;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import java.time.LocalDate;

@Data
@Builder
public class EmployeeDto {

    String name;

    String surname;

    String identityNumber;

    @JsonFormat(pattern = "dd/MM/yyyy")
    @JsonProperty("birth-date")
    LocalDate birthDate;

    JobInfo jobInfo;

    ContactInfo contactInfo;
}
