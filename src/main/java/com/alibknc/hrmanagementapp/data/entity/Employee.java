package com.alibknc.hrmanagementapp.data.entity;

import lombok.Data;
import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String name;

    String surname;

    String identityNumber;

    LocalDate birthDate;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    JobInfo jobInfo;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    ContactInfo contactInfo;
}
