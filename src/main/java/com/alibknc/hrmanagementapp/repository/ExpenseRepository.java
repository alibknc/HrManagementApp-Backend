package com.alibknc.hrmanagementapp.repository;

import com.alibknc.hrmanagementapp.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}
