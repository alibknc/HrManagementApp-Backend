package com.alibknc.hrmanagementapp.data.entity;

import com.alibknc.hrmanagementapp.data.entity.enums.Department;
import com.alibknc.hrmanagementapp.data.entity.enums.Level;
import com.alibknc.hrmanagementapp.data.entity.enums.Position;
import com.alibknc.hrmanagementapp.data.entity.enums.WorkType;
import lombok.Data;
import javax.persistence.*;

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

    int salary;
}
