package com.novadax.business.request;

import java.io.Serializable;

public class OrderFilterRequest implements Serializable {

    private String accountId;
    private String symbol;
    private String status;
    private String fromId;
    private String toId;
    private Long fromTimestamp;
    private Long toTimestamp;
    private Integer limit = 100;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFromId() {
        return fromId;
    }

    public void setFromId(String fromId) {
        this.fromId = fromId;
    }

    public String getToId() {
        return toId;
    }

    public void setToId(String toId) {
        this.toId = toId;
    }

    public Long getFromTimestamp() {
        return fromTimestamp;
    }

    public void setFromTimestamp(Long fromTimestamp) {
        this.fromTimestamp = fromTimestamp;
    }

    public Long getToTimestamp() {
        return toTimestamp;
    }

    public void setToTimestamp(Long toTimestamp) {
        this.toTimestamp = toTimestamp;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}
