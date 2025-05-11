package com.money.moneycheck.service;

import com.money.moneycheck.dto.expense.ExpenseListResDto;
import com.money.moneycheck.dto.expense.ExpenseReqDto;
import com.money.moneycheck.dto.expense.ExpenseResDto;
import com.money.moneycheck.dto.income.IncomeListResDto;
import com.money.moneycheck.dto.income.IncomeReqDto;
import com.money.moneycheck.dto.monthly.MonthlyListResDto;
import com.money.moneycheck.dto.monthly.MonthlyReqDto;
import com.money.moneycheck.mapper.MonthlyMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Slf4j
@RequiredArgsConstructor
public class MonthlyTransactionService {
    private final MonthlyMapper monthlyMapper;
    private final ExpenseService expenseService;
    private final IncomeService incomeService;

    public MonthlyListResDto getMonthlyList(MonthlyReqDto req) {

        Map<String, Object> reqDto = convertedDto(req);

        ExpenseListResDto expenseList = expenseService.getExpensesList((ExpenseReqDto)reqDto.get("expense"));
        IncomeListResDto incomeList = incomeService.getIncomeList((IncomeReqDto)reqDto.get("income"));


        return new MonthlyListResDto();
    }

    public Map<String, Object> convertedDto(MonthlyReqDto req){
        Map<String, Object> reqDto = new HashMap<>();
        reqDto.put("expense", new ExpenseReqDto(req.getUserId()));
        reqDto.put("income", new IncomeReqDto(req.getUserId()));
//       이체 관련 기능도 추가 예정

        return reqDto;


    }
}
