package com.alibknc.hrmanagementapp.data.repository;

import com.alibknc.hrmanagementapp.data.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;
import java.util.UUID;

public interface EmployeeRepository extends JpaRepository<Employee, UUID> {

    @Query("select e from Employee e join fetch e.contactInfo c join fetch e.jobInfo j")
    List<Employee> findAllEmployees();

}
