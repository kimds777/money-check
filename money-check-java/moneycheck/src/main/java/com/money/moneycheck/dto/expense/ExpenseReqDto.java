package com.money.moneycheck.dto.expense;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExpenseReqDto {
    private long userId;
    private String searchWord;
}
