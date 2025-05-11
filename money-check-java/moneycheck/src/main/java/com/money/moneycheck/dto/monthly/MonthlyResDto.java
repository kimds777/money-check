package com.money.moneycheck.dto.monthly;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class MonthlyResDto {
    private String transactionType;
    private Long transactionId;
    private String nickname;
    private String assetName;
    private String transactionClassName;
    private String content;
    private Date transactionAt;
    private int amount;
    private Date createdAt;
    private Date updatedAt;
}
