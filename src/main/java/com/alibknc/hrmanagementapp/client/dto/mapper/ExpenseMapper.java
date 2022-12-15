package com.alibknc.hrmanagementapp.client.dto.mapper;

import com.alibknc.hrmanagementapp.client.dto.request.CreateExpenseRequest;
import com.alibknc.hrmanagementapp.client.dto.response.ExpenseDto;
import com.alibknc.hrmanagementapp.data.entity.Expense;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(implementationName = "ExpenseMapperImpl", componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ExpenseMapper {

    ExpenseDto toExpenseDto(Expense expense);

    Expense toExpense(CreateExpenseRequest expense);

}
