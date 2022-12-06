package com.alibknc.hrmanagementapp.client.dto.mapper;

import com.alibknc.hrmanagementapp.client.dto.response.ExpenseDto;
import com.alibknc.hrmanagementapp.data.entity.Expense;
import org.mapstruct.Mapper;

@Mapper(implementationName = "ExpenseMapperImpl", componentModel = "spring")
public interface ExpenseMapper {

    ExpenseDto toExpenseDto(Expense expense);
}
