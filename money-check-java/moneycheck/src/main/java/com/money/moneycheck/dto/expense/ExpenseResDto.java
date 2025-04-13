package com.money.moneycheck.dto.expense;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ExpenseResDto {
    private Long expenditureId;
    private String nickname;
    private String assetName;
    private String expenditureClassName;
    private String content;
    private Date expenditureAt;
    private int amount;
    private Date createdAt;
    private Date updatedAt;
}
