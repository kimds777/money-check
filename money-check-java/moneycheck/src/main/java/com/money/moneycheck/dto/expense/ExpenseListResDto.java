package com.money.moneycheck.dto.expense;

import lombok.*;

import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExpenseListResDto {
    private List<ExpenseResDto> result;
    private Long totalAmount;
    private int totalCount;
}
