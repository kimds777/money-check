package com.money.moneycheck.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Date;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@Table(name = "monthly_expenditure_2503", schema = "money_check")
@Entity
public class Expense {
    @Id
    @Column(name = "expenditure_id")
    private long expenditureId;
    @Column(name = "user_id")
    private long userId;
    @Column(name = "asset_id")
    private long assetId;
    @Column(name = "expenditure_class_id")
    private long expenditureClassId;
    private String content;
    @Column(name = "expenditure_at")
    private Date expenditureAt;
    private int amount;
    @Column(name = "created_at")
    private Date createdAt;
    @Column(name = "updated_at")
    private Date updatedAt;
    @Column(name = "is_active")
    private boolean isActive;

}
