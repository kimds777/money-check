package com.money.moneycheck.repository;

import com.money.moneycheck.domain.Expense;
import com.money.moneycheck.domain.Income;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IncomeRepository extends JpaRepository<Income, Long> {
    Optional<Income> findByUserId(Long userId);
}
