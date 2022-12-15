package com.alibknc.hrmanagementapp.data.entity;

import com.alibknc.hrmanagementapp.data.entity.enums.PermitType;
import lombok.Data;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Data
@Entity
public class Permit {

    @Id
    @GeneratedValue
    @Column(length = 36)
    UUID id;

    @Column(nullable = false)
    LocalDate startDate;

    @Column(nullable = false)
    LocalDate finishDate;

    @Column(nullable = false)
    String details;

    @Column(nullable = false)
    @Enumerated(value = EnumType.STRING)
    PermitType permitType;

    @JoinColumn(nullable = false)
    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    Employee employee;
}
