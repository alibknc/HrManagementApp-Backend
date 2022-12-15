package com.alibknc.hrmanagementapp.data.repository;

import com.alibknc.hrmanagementapp.data.entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;
import java.util.UUID;

public interface ExpenseRepository extends JpaRepository<Expense, UUID> {

    @Query("select x from Expense x join fetch x.employee e")
    List<Expense> findAllExpenses();

}
