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

    @Column(nullable = false)
    @Enumerated(value = EnumType.STRING)
    Department department;

    @Column(nullable = false)
    @Enumerated(value = EnumType.STRING)
    Level level;

    @Column(nullable = false)
    @Enumerated(value = EnumType.STRING)
    Position position;

    @Column(nullable = false)
    @Enumerated(value = EnumType.STRING)
    WorkType workType;

    @Column(nullable = false)
    @JsonFormat(pattern = "dd/MM/yyyy")
    @JsonProperty("start-date")
    LocalDate startDate;

    @Column(nullable = false)
    int salary;
}
