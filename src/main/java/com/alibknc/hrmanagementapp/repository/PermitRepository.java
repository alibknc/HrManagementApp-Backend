package com.alibknc.hrmanagementapp.repository;

import com.alibknc.hrmanagementapp.model.Permit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermitRepository extends JpaRepository<Permit, Long> {
}
