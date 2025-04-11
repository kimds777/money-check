package com.money.moneycheck.controller;

import com.money.moneycheck.domain.Income;
import com.money.moneycheck.service.IncomeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/income")
public class IncomeController {
    private final IncomeService incomeService;

    @GetMapping("/{userId}")
    public Optional<Income> getIncomeListByUserId(@PathVariable("userId") Long userId) {
        Optional<Income> income = incomeService.getIncomeListByUserId(userId);
        return income;
    }
}
