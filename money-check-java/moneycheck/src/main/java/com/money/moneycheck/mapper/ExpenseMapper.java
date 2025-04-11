package com.money.moneycheck.mapper;

import com.money.moneycheck.dto.expense.ExpenseListResDto;
import com.money.moneycheck.dto.expense.ExpenseReqDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ExpenseMapper {
    ExpenseListResDto getExpensesList(ExpenseReqDto req);
}
