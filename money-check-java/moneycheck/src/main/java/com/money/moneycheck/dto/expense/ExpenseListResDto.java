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
    private List<ExpenseResDto> result;
    private Long totalAmount;
    private int totalCount;

    public static ExpenseListResDto createResult(List<ExpenseResDto> expenseList, long totalAmount, int totalCount) {
        return new ExpenseListResDto(expenseList, totalAmount, totalCount);
    }

//    @Getter
//    @Setter
//    public static class ExpenseResDto {
//        private Long expenditureId;
//        private Long userId;
//        private Long assetId;
//        private Long expenditureClassId;
//        private String content;
//        private Date expenditureAt;
//        private Integer amount;
//        private Date createdAt;
//        private Date updatedAt;
//        private Boolean isActive;
//
//        public ExpenseResDto(Map<String, Object> expense) {
//            if (expense != null) {
//                this.expenditureId = Long.parseLong(Objects.toString(expense.get("expenditureId"), null));
//                this.userId = Long.parseLong(Objects.toString(expense.get("userId"), null));
//                this.assetId = Long.parseLong(Objects.toString(expense.get("assetId"), null));
//                this.expenditureClassId = Long.parseLong(Objects.toString(expense.get("expenditureClassId"), null));
//                this.content = Objects.toString(expense.get("content"), null);
//                this.expenditureAt = (Date) expense.get("expenditureAt");
//                this.amount = Integer.parseInt(Objects.toString(expense.get("amount")));
//                this.createdAt = (Date) expense.get("createdAt");
//                this.updatedAt = (Date) expense.get("updatedAt");
//                this.isActive = Boolean.parseBoolean(Objects.toString(expense.get("isActive")));
//            }
//        }
//
//
//    }

}
