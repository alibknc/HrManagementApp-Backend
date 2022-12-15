package com.alibknc.hrmanagementapp.data.entity;

import lombok.Data;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Data
@Entity
public class Employee {

    @Id
    @GeneratedValue
    @Column(length = 36)
    UUID id;

    @Column(nullable = false)
    String name;

    @Column(nullable = false)
    String surname;

    @Column(nullable = false, unique = true)
    String identityNumber;

    @Column(nullable = false)
    LocalDate birthDate;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    JobInfo jobInfo;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    ContactInfo contactInfo;
}
