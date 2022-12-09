package com.alibknc.hrmanagementapp.data.repository;

import com.alibknc.hrmanagementapp.data.entity.ContactInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactInfoRepository extends JpaRepository<ContactInfo, Long> {
}
