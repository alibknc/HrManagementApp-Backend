package com.alibknc.hrmanagementapp.model;

import com.alibknc.hrmanagementapp.model.enums.Department;
import com.alibknc.hrmanagementapp.model.enums.Level;
import com.alibknc.hrmanagementapp.model.enums.Position;
import com.alibknc.hrmanagementapp.model.enums.WorkType;
import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class JobInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    Long employeeId;

    Department department;

    Level level;

    Position position;

    WorkType workType;

    int salary;
}
