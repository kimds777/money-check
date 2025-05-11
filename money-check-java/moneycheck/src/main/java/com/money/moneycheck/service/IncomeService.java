package com.money.moneycheck.service;

import com.money.moneycheck.domain.Income;
import com.money.moneycheck.dto.income.IncomeListResDto;
import com.money.moneycheck.dto.income.IncomeReqDto;
import com.money.moneycheck.dto.income.IncomeResDto;
import com.money.moneycheck.mapper.IncomeMapper;
import com.money.moneycheck.repository.IncomeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class IncomeService {
    private final IncomeRepository incomeRepository;
    private final IncomeMapper incomeMapper;

    public Optional<Income> getIncomeListByUserId(Long userId) {
        return incomeRepository.findById(userId);
    }

    public IncomeListResDto getIncomeList(IncomeReqDto req) {
        log.info(req.toString());

        req.setSearchListCountYn("Y");
        int totalCount = incomeMapper.getIncomesCount(req);
        if (totalCount == 0){
            return new IncomeListResDto(Collections.emptyList(), 0L, 0);
        }

        req.setSearchListCountYn("N");
        List<IncomeResDto> incomeList = incomeMapper.getIncomeList(req);

        long totalAmount = incomeList.stream().mapToLong(IncomeResDto::getAmount).sum();

        return new IncomeListResDto(incomeList, totalAmount, totalCount);
    }
}
