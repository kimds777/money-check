package com.money.moneycheck.dto.monthly;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MonthlyListResDto {
    private List<MonthlyResDto> result;
    private Long totalAmount;
    private int totalCount;
    private Long totalExpenseAmount;
    private int totalExpenseCount;
    private Long totalIncomeAmount;
    private int totalIncomeCount;
}
