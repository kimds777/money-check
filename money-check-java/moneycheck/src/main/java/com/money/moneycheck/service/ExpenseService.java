package com.money.moneycheck.service;

import com.money.moneycheck.domain.Expense;
import com.money.moneycheck.repository.ExpenseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ExpenseService {
    private final ExpenseRepository expenseRepository;

    public Optional<Expense> getExpensesByUserId(@PathVariable Long userId) {
        Optional<Expense> expense= expenseRepository.findByUserId(userId);
        if (expense.isPresent()){
            return expense;
        }
        return null;
    }
}
