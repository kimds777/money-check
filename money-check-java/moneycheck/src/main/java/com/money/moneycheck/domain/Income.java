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
@Table(name = "monthly_income_2503", schema = "money_check")
@Entity
public class Income {
    @Id
    private long income_id;
    @Column(name = "user_id")
    private long userId;
    private long asset_id;
    private long income_class_id;
    private String content;
    private Date income_at;
    private int amount;
    private Date created_at;
    private Date updated_at;
    private boolean is_active;
}
