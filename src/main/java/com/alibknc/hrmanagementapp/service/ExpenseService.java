package com.alibknc.hrmanagementapp.service;

import com.alibknc.hrmanagementapp.client.dto.mapper.ExpenseMapper;
import com.alibknc.hrmanagementapp.client.dto.request.CreateExpenseRequest;
import com.alibknc.hrmanagementapp.client.dto.response.ExpenseDto;
import com.alibknc.hrmanagementapp.data.entity.Employee;
import com.alibknc.hrmanagementapp.data.entity.Expense;
import com.alibknc.hrmanagementapp.data.repository.EmployeeRepository;
import com.alibknc.hrmanagementapp.data.repository.ExpenseRepository;
import com.alibknc.hrmanagementapp.exception.EmployeeNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Slf4j
@Service
public class ExpenseService {
    private final ExpenseRepository expenseRepository;
    private final EmployeeRepository employeeRepository;
    private final ExpenseMapper expenseMapper;

    @Transactional(readOnly = true)
    public List<ExpenseDto> getAllExpenses() {
        List<Expense> expenseList = expenseRepository.findAllExpenses();

        return expenseList.stream()
                .map(expenseMapper::toExpenseDto)
                .collect(Collectors.toList());
    }

    public void createExpense(CreateExpenseRequest request) {
        Expense expense = expenseMapper.toExpense(request);
        Employee employee = employeeRepository.findById(request.getEmployeeId())
                .orElseThrow(() -> new EmployeeNotFoundException("Employee not found"));
        expense.setEmployee(employee);
        expenseRepository.save(expense);
    }

    public void deleteExpense(UUID id) {
        expenseRepository.deleteById(id);
    }
}
