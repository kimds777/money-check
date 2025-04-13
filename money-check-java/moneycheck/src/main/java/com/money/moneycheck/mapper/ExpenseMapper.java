package com.money.moneycheck.mapper;

import com.money.moneycheck.dto.expense.ExpenseListResDto;
import com.money.moneycheck.dto.expense.ExpenseReqDto;
import com.money.moneycheck.dto.expense.ExpenseResDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ExpenseMapper {
    int getExpensesCount(ExpenseReqDto req);
    List<ExpenseResDto> getExpensesList(ExpenseReqDto req);
}
