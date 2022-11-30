package com.alibknc.hrmanagementapp.mapper;

import com.alibknc.hrmanagementapp.client.dto.response.ExpenseDto;
import com.alibknc.hrmanagementapp.model.Expense;
import org.mapstruct.Mapper;

@Mapper(implementationName = "ExpenseMapperImpl", componentModel = "spring")
public interface ExpenseMapper {

    ExpenseDto toExpenseDto(Expense expense);
}
