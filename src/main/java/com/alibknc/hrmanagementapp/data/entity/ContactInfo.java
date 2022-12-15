package com.alibknc.hrmanagementapp.data.entity;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
public class ContactInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(nullable = false)
    String phoneNumber;

    @Column(nullable = false)
    String email;

    @Column(nullable = false)
    String city;

    @Column(nullable = false)
    String country;

    @Column(nullable = false)
    String address;

    @Column(nullable = false)
    int postCode;
}
