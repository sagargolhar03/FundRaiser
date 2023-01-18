package com.zemoso.FundRaiser.model;

public class PmtSheduleCustom {


    private Integer userId;

    private Integer cashKickId;

    public PmtSheduleCustom() {
    }

    public PmtSheduleCustom(Integer userId, Integer cashKickId) {
        this.userId = userId;
        this.cashKickId = cashKickId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCashKickId() {
        return cashKickId;
    }

    public void setCashKickId(Integer cashKickId) {
        this.cashKickId = cashKickId;
    }

    @Override
    public String toString() {
        return "PmtSheduleCustom{" +
                "userId=" + userId +
                ", cashKickId=" + cashKickId +
                '}';
    }
}

