package com.money.moneycheck.service;

import com.money.moneycheck.domain.Income;
import com.money.moneycheck.repository.IncomeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class IncomeService {
    private final IncomeRepository incomeRepository;

    public Optional<Income> getIncomeListByUserId(Long userId) {
        return incomeRepository.findById(userId);
    }
}
