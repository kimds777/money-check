package com.money.moneycheck.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class ExpenseService {

    public String getExpensesByUserId(@PathVariable Long user_id) {

        return "index";
    }
}
