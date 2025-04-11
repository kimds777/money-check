package com.money.moneycheck.repository;

import com.money.moneycheck.domain.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense,Long> {
    Optional<Expense> findByUserId(Long userId);
}
