package com.alibknc.hrmanagementapp.data.repository;

import com.alibknc.hrmanagementapp.data.entity.JobInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobInfoRepository extends JpaRepository<JobInfo, Long> {
}
