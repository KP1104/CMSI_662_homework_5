package com.project;

public class Transaction {

    private Long userId;

    private String userName;

    private Long balance;

    private Long amount;

    @Override
    public String toString() {
        return "Transaction{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", balance=" + balance +
                ", amount=" + amount +
                '}';
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }
}
