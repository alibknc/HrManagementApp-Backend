package com.alibknc.hrmanagementapp.model;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class ContactInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    Long employeeId;

    String phoneNumber;

    String email;

    String city;

    String country;

    String address;

    int postCode;
}