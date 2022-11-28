package com.alibknc.hrmanagementapp.repository;

import com.alibknc.hrmanagementapp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
