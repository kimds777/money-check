package com.money.moneycheck.service;

import com.money.moneycheck.domain.Income;
import com.money.moneycheck.repository.IncomeRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class IncomeService {
    private IncomeRepository incomeRepository;

    public IncomeService(IncomeRepository incomeRepository) {
        this.incomeRepository = incomeRepository;
    }

    public Optional<Income> getIncomeListByUserId(Long userId) {
        return incomeRepository.findById(userId);
    }
}
