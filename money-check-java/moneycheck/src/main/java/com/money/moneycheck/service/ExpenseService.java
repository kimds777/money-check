package com.money.moneycheck.service;

import com.money.moneycheck.domain.Expense;
import com.money.moneycheck.dto.expense.ExpenseListResDto;
import com.money.moneycheck.dto.expense.ExpenseReqDto;
import com.money.moneycheck.mapper.ExpenseMapper;
import com.money.moneycheck.repository.ExpenseRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class ExpenseService {
//    private final ExpenseRepository expenseRepository;

    private final ExpenseMapper expenseMapper;

    public ExpenseListResDto getExpensesList(ExpenseReqDto req) {
        log.info(req.toString());
        ExpenseListResDto expenseList= expenseMapper.getExpensesList(req);

        log.info(expenseList.toString());
//        if (expense.isPresent()){
//            return expense;
//        }
        return expenseList;
    public Optional<Expense> getExpensesByUserId(@PathVariable Long userId) {
        Optional<Expense> expense= expenseRepository.findByUserId(userId);
        if (expense.isPresent()){
            return expense;
        }
        return null;
    }
}
