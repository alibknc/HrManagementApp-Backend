package com.alibknc.hrmanagementapp.model;

import com.alibknc.hrmanagementapp.model.enums.ExpenseType;
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

    @Enumerated
    ExpenseType expenseType;

    String details;

    LocalDate expenseDate;
}
