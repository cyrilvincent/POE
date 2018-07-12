package com.m2i.poe.bank;

import java.util.Date;

public class Transaction {

    private int id;
    private Date date = new Date();
    private double amount;
    private Account fromAccount;
    private Account toAccount;

    public Transaction() {

    }
    public Transaction(double amount) {
        this.setAmount(amount);
    }

    public String toString() {
        return "Transaction "+ getId() +" "+ getDate() +": "+ getAmount() +" from "+ getFromAccount() + " to "+ getToAccount();
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Account getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(Account fromAccount) {
        this.fromAccount = fromAccount;
    }

    public Account getToAccount() {
        return toAccount;
    }

    public void setToAccount(Account toAccount) {
        this.toAccount = toAccount;
    }
}
