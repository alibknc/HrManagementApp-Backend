package com.alibknc.hrmanagementapp.data.entity;

import com.alibknc.hrmanagementapp.data.entity.enums.ExpenseType;
import lombok.Data;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Data
@Entity
public class Expense {

    @Id
    @GeneratedValue
    @Column(length = 36)
    UUID id;

    @Column(nullable = false)
    int expenseAmount;

    @Column(nullable = false)
    int vat;

    @Column(nullable = false)
    @Enumerated(value = EnumType.STRING)
    ExpenseType expenseType;

    @Column(nullable = false)
    String details;

    @Column(nullable = false)
    LocalDate expenseDate;

    @JoinColumn(nullable = false)
    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    Employee employee;
}
