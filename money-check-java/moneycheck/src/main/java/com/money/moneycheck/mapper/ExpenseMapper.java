package com.money.moneycheck.mapper;

import com.money.moneycheck.domain.Expense;
import com.money.moneycheck.dto.expense.ExpenseListResDto;
import com.money.moneycheck.dto.expense.ExpenseReqDto;
import com.money.moneycheck.dto.expense.ExpenseResDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface ExpenseMapper {
    int getExpensesCount(ExpenseReqDto req);
    List<ExpenseResDto> getExpensesList(ExpenseReqDto req);
    Expense getExpense(ExpenseReqDto req);
}
