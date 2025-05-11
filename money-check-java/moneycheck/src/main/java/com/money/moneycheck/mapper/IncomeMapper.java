package com.money.moneycheck.mapper;

import com.money.moneycheck.dto.income.IncomeReqDto;
import com.money.moneycheck.dto.income.IncomeResDto;

import java.util.List;

public interface IncomeMapper {
    int getIncomesCount(IncomeReqDto req);
    List<IncomeResDto> getIncomeList(IncomeReqDto req);
}
