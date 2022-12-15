package com.alibknc.hrmanagementapp.client.dto.response;

import com.alibknc.hrmanagementapp.data.entity.enums.ExpenseType;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@Builder
public class ExpenseDto implements Serializable {

    UUID id;

    int expenseAmount;

    int vat;

    @Enumerated(value = EnumType.STRING)
    ExpenseType expenseType;

    String details;

    @JsonFormat(pattern = "dd/MM/yyyy")
    @JsonProperty("expense-date")
    LocalDate expenseDate;

    EmployeeDto employee;
}