package com.alibknc.hrmanagementapp.controller;

import com.alibknc.hrmanagementapp.client.dto.response.ExpenseDto;
import com.alibknc.hrmanagementapp.service.ExpenseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/api/v1/expenses")
public class ExpenseController {

    private final ExpenseService expenseService;

    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @GetMapping
    public ResponseEntity<List<ExpenseDto>> getAllExpenses() {
        return ResponseEntity.ok(expenseService.getAllExpenses());
    }

    @PostMapping
    public ResponseEntity<Object> createExpense(@Valid @RequestBody ExpenseDto expense) {
        return ResponseEntity.ok(expenseService.createExpense(expense));
    }
}
