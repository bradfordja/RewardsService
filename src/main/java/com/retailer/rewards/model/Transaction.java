package com.retailer.rewards.model;

import java.time.LocalDate;

public class Transaction {
    private int customerId;
    private double amount;
    private LocalDate transactionDate;
    public int getCustomerId() {
        return customerId;
    }
    public double getAmount() {
        return amount;
    }
    public LocalDate getTransactionDate() {
        return transactionDate;
    }
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }
    @Override
    public String toString() {
        return "Transaction [customerId=" + customerId + ", amount=" + amount + ", transactionDate=" + transactionDate
                + "]";
    }
}
