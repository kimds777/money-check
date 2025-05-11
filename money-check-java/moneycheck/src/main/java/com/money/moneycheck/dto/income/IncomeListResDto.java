package com.money.moneycheck.dto.income;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class IncomeListResDto {
    private List<IncomeResDto> result;
    private Long totalAmount;
    private int totalCount;
}
