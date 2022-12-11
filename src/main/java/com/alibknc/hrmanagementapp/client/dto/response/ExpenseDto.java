package com.alibknc.hrmanagementapp.client.dto.response;

import com.alibknc.hrmanagementapp.data.entity.enums.ExpenseType;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDate;

@Data
@Builder
public class ExpenseDto {

    int expenseAmount;

    int vat;

    @Enumerated(value = EnumType.STRING)
    ExpenseType expenseType;

    String details;

    @JsonFormat(pattern = "dd/MM/yyyy")
    @JsonProperty("expense-date")
    LocalDate expenseDate;
}