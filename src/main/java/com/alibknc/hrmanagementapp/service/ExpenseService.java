package com.alibknc.hrmanagementapp.service;

import com.alibknc.hrmanagementapp.client.dto.response.ExpenseDto;
import com.alibknc.hrmanagementapp.client.dto.mapper.ExpenseMapper;
import com.alibknc.hrmanagementapp.data.entity.Expense;
import com.alibknc.hrmanagementapp.data.repository.ExpenseRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Slf4j
@Service
public class ExpenseService {
    private final ExpenseRepository expenseRepository;
    private final ExpenseMapper expenseMapper;

    public List<ExpenseDto> getAllExpenses() {
        List<Expense> expenseList = expenseRepository.findAll();

        return expenseList.stream()
                .map(expenseMapper::toExpenseDto)
                .collect(Collectors.toList());
    }

    public ExpenseDto createExpense(ExpenseDto expense) {
        expenseRepository.save(expenseMapper.toExpense(expense));
        return expense;
    }
}
