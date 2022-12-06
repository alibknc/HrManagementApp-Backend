package com.alibknc.hrmanagementapp.data.entity;

import com.alibknc.hrmanagementapp.data.entity.enums.PermitType;
import lombok.Data;
import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
public class Permit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    Long employeeId;

    LocalDate startDate;

    LocalDate finishDate;

    String details;

    @Enumerated(value = EnumType.STRING)
    PermitType permitType;
}
