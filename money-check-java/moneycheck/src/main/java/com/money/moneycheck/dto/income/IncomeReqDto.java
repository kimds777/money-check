package com.money.moneycheck.dto.income;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

@Getter
@Setter
@Validated
public class IncomeReqDto {
    @NotNull
    private long userId;
    private Long assetId;
    private String yearMonth;
    private String searchWord;
    private String searchListCountYn;

    public IncomeReqDto(long userId){
        this.userId = userId;
    }
}
