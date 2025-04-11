package com.money.moneycheck.controller;


import com.money.moneycheck.domain.Expense;
import com.money.moneycheck.dto.expense.ExpenseListResDto;
import com.money.moneycheck.dto.expense.ExpenseReqDto;
import com.money.moneycheck.service.ExpenseService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@Tag(name = "지출내역", description = "조회/등록/수정/삭제 기능")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/expenses")
public class ExpenseController {

    private final ExpenseService expenseService;

    @Operation(summary = "지출내역 조회", description = "기존 요청값 user_id")
    @GetMapping("/list")
    public ExpenseListResDto getExpensesList(ExpenseReqDto req) {
        ExpenseListResDto expenseList = expenseService.getExpensesList(req);
        System.out.println(expenseList.getResult());
        return expenseList;
//    @GetMapping("/{userId}")
//    public Optional<Expense> getExpensesByUserId(@PathVariable("userId") Long userId) {
//        Optional<Expense> expenseList = expenseService.getExpensesByUserId(userId);
//
//        return expenseList;
//    }

    @GetMapping("/main")
    public ResponseEntity<Expense> getExpensesAll(Expense expense) { //나중에 파라미터 USER로 변경
        Optional<Expense> expenseList = expenseService.getExpensesByUserId(expense.getUserId());

        return expenseList
                .map(e -> ResponseEntity.ok(e)) //메서드 레퍼런스로 줄인 코드 -> ResponseEntity::ok (Body에 e가 담겨진다)
                .orElseGet(() -> ResponseEntity.notFound().build()); // 값이 없는 경우 실행되는 코드 (404)
    }
}
