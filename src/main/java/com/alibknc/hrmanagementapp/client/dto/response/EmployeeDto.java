package com.alibknc.hrmanagementapp.client.dto.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@Builder
public class EmployeeDto implements Serializable {

    UUID id;

    String name;

    String surname;

    String identityNumber;

    @JsonFormat(pattern = "dd/MM/yyyy")
    @JsonProperty("birth-date")
    LocalDate birthDate;

    JobInfoDto jobInfo;

    ContactInfoDto contactInfo;
}
