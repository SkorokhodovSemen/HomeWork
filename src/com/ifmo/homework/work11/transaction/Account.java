package com.ifmo.homework.work11.transaction;

public class Account {

    private String number;
    private long balance;

    public Account(String number, long balance) {
        this.number = number;
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }
    // TODO: добавить геттеры и сеттеры
}
