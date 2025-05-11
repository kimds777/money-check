package com.money.moneycheck.dto.monthly;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

@Getter
@Setter
@Validated
public class MonthlyReqDto {
    @NotNull
    private long userId;
    private Long assetId;
    private String yearMonth;
//    private Long transactionId;
//    private String transactionType;
//    private Long transactionClassId;
//    private String searchWord;
//    private String searchListCountYn;
}
