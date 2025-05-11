package com.money.moneycheck.controller;

import com.money.moneycheck.domain.Income;
import com.money.moneycheck.dto.income.IncomeListResDto;
import com.money.moneycheck.dto.income.IncomeReqDto;
import com.money.moneycheck.service.IncomeService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/income")
public class IncomeController {
    private final IncomeService incomeService;

    @Operation(summary = "수입내역 조회", description = "기본 요청값 user_id")
    @PostMapping("/list")
    public ResponseEntity<IncomeListResDto> getIncomeList(@Validated @RequestBody IncomeReqDto req) {
        IncomeListResDto incomeList = incomeService.getIncomeList(req);
        return ResponseEntity.ok(incomeList);
    }

    @GetMapping("/{userId}")
    public Optional<Income> getIncomeListByUserId(@PathVariable("userId") Long userId) {
        Optional<Income> income = incomeService.getIncomeListByUserId(userId);
        return income;
    }
}
