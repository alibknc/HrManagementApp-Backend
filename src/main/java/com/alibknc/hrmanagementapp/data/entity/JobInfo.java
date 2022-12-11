package com.alibknc.hrmanagementapp.data.entity;

import com.alibknc.hrmanagementapp.data.entity.enums.Department;
import com.alibknc.hrmanagementapp.data.entity.enums.Level;
import com.alibknc.hrmanagementapp.data.entity.enums.Position;
import com.alibknc.hrmanagementapp.data.entity.enums.WorkType;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
public class JobInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Enumerated(value = EnumType.STRING)
    Department department;

    @Enumerated(value = EnumType.STRING)
    Level level;

    @Enumerated(value = EnumType.STRING)
    Position position;

    @Enumerated(value = EnumType.STRING)
    WorkType workType;

    @JsonFormat(pattern = "dd/MM/yyyy")
    @JsonProperty("start-date")
    LocalDate startDate;

    int salary;
}
