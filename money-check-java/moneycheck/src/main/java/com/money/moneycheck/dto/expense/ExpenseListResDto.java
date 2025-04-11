package com.money.moneycheck.dto.expense;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

@Getter
@AllArgsConstructor
public class ExpenseListResDto {
    private List<ExpenseListDto> result;
    private Long totalExpenses;

    public static ExpenseListResDto createResult(List<Map<String, Object>> expenseList, long totalExpenses) {
        return new ExpenseListResDto(expenseList.stream().map(ExpenseListDto::new).collect(Collectors.toList()), totalExpenses);
    }

    @Getter
    @Setter
    public static class ExpenseListDto {
        private Long expenditureId;
        private Long userId;
        private Long assetId;
        private Long expenditureClassId;
        private String content;
        private Date expenditureAt;
        private Integer amount;
        private Date createdAt;
        private Date updatedAt;
        private Boolean isActive;

        public ExpenseListDto(Map<String, Object> expense) {
            if(expense != null) {
                this.expenditureId = Long.parseLong(Objects.toString(expense.get("expenditureId"), null));
                this.userId = Long.parseLong(Objects.toString(expense.get("userId"), null));
                this.assetId = Long.parseLong(Objects.toString(expense.get("assetId"), null));
                this.expenditureClassId = Long.parseLong(Objects.toString(expense.get("expenditureClassId"), null));
                this.content = Objects.toString(expense.get("content"), null);
            }
        }


    }

}
