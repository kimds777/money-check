package com.money.moneycheck.dto.expense;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

@Getter
@Setter
@Validated
public class ExpenseReqDto {
    @NotNull
    private long userId;
    private Long assetId;
    private String searchWord;
    private String searchListCountYn;
}
