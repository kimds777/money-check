package com.money.moneycheck.controller;


import com.money.moneycheck.domain.Expense;
import com.money.moneycheck.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/expenses")
public class ExpenseController {

    private final ExpenseService expenseService;

    @Autowired
    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @GetMapping("/{user_id}")
    public Optional<Expense> getExpensesByUserId(@PathVariable("user_id") Long userId) {
        Optional<Expense> expenseList = expenseService.getExpensesByUserId(userId);

        return expenseList;
    }
}
