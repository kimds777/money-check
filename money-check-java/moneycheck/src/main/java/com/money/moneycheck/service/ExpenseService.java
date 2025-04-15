package com.money.moneycheck.service;

import com.money.moneycheck.domain.Expense;
import com.money.moneycheck.dto.expense.ExpenseListResDto;
import com.money.moneycheck.dto.expense.ExpenseReqDto;
import com.money.moneycheck.dto.expense.ExpenseResDto;
import com.money.moneycheck.mapper.ExpenseMapper;
import com.money.moneycheck.repository.ExpenseRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class ExpenseService {
    private final ExpenseRepository expenseRepository;
    private final ExpenseMapper expenseMapper;

    public ExpenseListResDto getExpensesList(ExpenseReqDto req) {
        log.info(req.toString());

        req.setSearchListCountYn("Y");
        int totalCount = expenseMapper.getExpensesCount(req);
        if (totalCount == 0){
            return new ExpenseListResDto(Collections.emptyList(), 0L, 0);
        }

        req.setSearchListCountYn("N");
        List<ExpenseResDto> expenseList = expenseMapper.getExpensesList(req);

        long totalAmount = expenseList.stream().mapToInt(ExpenseResDto::getAmount).sum();

        return new ExpenseListResDto(expenseList, totalAmount, totalCount);
    }

    public Optional<Expense> getExpense(ExpenseReqDto req) {
        return Optional.ofNullable(expenseMapper.getExpense(req));
    }

}
