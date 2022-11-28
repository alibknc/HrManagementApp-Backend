package com.alibknc.hrmanagementapp.model;

import com.alibknc.hrmanagementapp.model.enums.Department;
import com.alibknc.hrmanagementapp.model.enums.Level;
import com.alibknc.hrmanagementapp.model.enums.Position;
import com.alibknc.hrmanagementapp.model.enums.WorkType;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class JobInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    Long employeeId;

    @Enumerated(value = EnumType.STRING)
    Department department;

    @Enumerated(value = EnumType.STRING)
    Level level;

    @Enumerated(value = EnumType.STRING)
    Position position;

    @Enumerated(value = EnumType.STRING)
    WorkType workType;

    int salary;
}
