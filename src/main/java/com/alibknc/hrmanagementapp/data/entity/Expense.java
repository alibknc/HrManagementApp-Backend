package com.alibknc.hrmanagementapp.data.entity;

import com.alibknc.hrmanagementapp.data.entity.enums.ExpenseType;
import lombok.Data;
import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    Long employeeId;

    int expenseAmount;

    int vat;

    @Enumerated(value = EnumType.STRING)
    ExpenseType expenseType;

    String details;

    LocalDate expenseDate;
}
