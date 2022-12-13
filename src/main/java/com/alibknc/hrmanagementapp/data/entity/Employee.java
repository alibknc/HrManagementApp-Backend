package com.alibknc.hrmanagementapp.data.entity;

import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Data
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @NotBlank
    String name;

    @NotBlank
    String surname;

    @NotBlank
    String identityNumber;

    @NotBlank
    LocalDate birthDate;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    JobInfo jobInfo;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    ContactInfo contactInfo;
}
