package com.money.moneycheck.repository;

import com.money.moneycheck.domain.Expense;
import com.money.moneycheck.domain.Income;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IncomeRepository extends JpaRepository<Income, Long> {
    Optional<Income> findByUserId(Long userId);
}
