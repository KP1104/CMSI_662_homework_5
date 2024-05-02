package com.project.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "current")
public class ClosingAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userId;

    private String userName;

    private long closingBalance;

    @Override
    public String toString() {
        return "ClosingAccount{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", closingBalance=" + closingBalance +
                '}';
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public long getClosingBalance() {
        return closingBalance;
    }

    public void setClosingBalance(long closingBalance) {
        this.closingBalance = closingBalance;
    }
}
