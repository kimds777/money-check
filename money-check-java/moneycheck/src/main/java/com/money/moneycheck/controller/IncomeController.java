package com.money.moneycheck.controller;

import com.money.moneycheck.domain.Income;
import com.money.moneycheck.service.IncomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/income")
public class IncomeController {
    private final IncomeService incomeService;

    @Autowired
    public IncomeController(IncomeService incomeService) {
        this.incomeService = incomeService;
    }

    @GetMapping("/{userId}")
    public Optional<Income> getIncomeListByUserId(@PathVariable("userId") Long userId) {
        Optional<Income> income = incomeService.getIncomeListByUserId(userId);
        return income;
    }
}
