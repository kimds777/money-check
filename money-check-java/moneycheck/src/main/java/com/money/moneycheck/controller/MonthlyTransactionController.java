package com.money.moneycheck.controller;

import com.money.moneycheck.dto.expense.ExpenseListResDto;
import com.money.moneycheck.dto.expense.ExpenseReqDto;
import com.money.moneycheck.dto.monthly.MonthlyListResDto;
import com.money.moneycheck.dto.monthly.MonthlyReqDto;
import com.money.moneycheck.service.MonthlyTransactionService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "월별내역", description = "조회 기능")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/monthly")
public class MonthlyTransactionController {

    private final MonthlyTransactionService monthlyTransactionService;

    @Operation(summary = "월별내역 조회", description = "기본 요청값 user_id")
    @PostMapping("/list")
    public ResponseEntity getMonthlyList(@Validated @RequestBody MonthlyReqDto req) {
        MonthlyListResDto monthlyList = monthlyTransactionService.getMonthlyList(req);

        return ResponseEntity.ok(monthlyList);
    }
}
