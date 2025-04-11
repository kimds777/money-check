package com.money.moneycheck.controller;


import com.money.moneycheck.domain.Expense;
import com.money.moneycheck.service.ExpenseService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/expenses")
public class ExpenseController {

    private final ExpenseService expenseService;

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
