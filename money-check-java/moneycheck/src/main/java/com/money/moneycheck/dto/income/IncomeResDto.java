package com.money.moneycheck.dto.income;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class IncomeResDto {
    private Long incomeId;
    private String nickname;
    private String assetName;
    private String incomeClassName;
    private String content;
    private Date incomeAt;
    private int amount;
    private Date createdAt;
    private Date updatedAt;
}
