package com.money.moneycheck.dto;

import java.util.Date;

public class Expense {
    private long expenditure_id;
    private long user_id;
    private long asset_id;
    private long expenditure_class_id;
    private String content;
    private Date expenditure_at;
    private int amount;
    private Date created_at;
    private Date updated_at;
    private boolean is_active;

    public Expense(){};

    public Expense(long expenditure_id, long user_id, long asset_id, long expenditure_class_id, String content, Date expenditure_at, int amount, Date created_at, Date updated_at, boolean is_active) {
        this.expenditure_id = expenditure_id;
        this.user_id = user_id;
        this.asset_id = asset_id;
        this.expenditure_class_id = expenditure_class_id;
        this.content = content;
        this.expenditure_at = expenditure_at;
        this.amount = amount;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.is_active = is_active;
    }

    public long getExpenditure_id() {
        return expenditure_id;
    }

    public void setExpenditure_id(long expenditure_id) {
        this.expenditure_id = expenditure_id;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public long getAsset_id() {
        return asset_id;
    }

    public void setAsset_id(long asset_id) {
        this.asset_id = asset_id;
    }

    public long getExpenditure_class_id() {
        return expenditure_class_id;
    }

    public void setExpenditure_class_id(long expenditure_class_id) {
        this.expenditure_class_id = expenditure_class_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getExpenditure_at() {
        return expenditure_at;
    }

    public void setExpenditure_at(Date expenditure_at) {
        this.expenditure_at = expenditure_at;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    public boolean isIs_active() {
        return is_active;
    }

    public void setIs_active(boolean is_active) {
        this.is_active = is_active;
    }

}
