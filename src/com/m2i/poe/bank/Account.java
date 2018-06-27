package com.m2i.poe.bank;

import java.util.Date;

public class Account {

    private int id = 0;
    private double solde = 0;
    private boolean isActive = true;
    private boolean isBlocked = false;
    private Date creationDate = new Date();

    public Account() {
    }

    public Account(int id) {
        this.id = id;
    }


    void deposit(double amount) {
        if(isActive() && !isBlocked()) {
            solde = getSolde() + amount;
        }
    }

    double withdraw(double amount) {
        if(isActive() && !isBlocked()) {
            if (amount <= getSolde()) {
                solde = getSolde() - amount;
                return amount;
            } else {
                return 0;
            }
        }
        else {
            return 0;
        }
    }

    void close() {
        isActive = false;
    }

    void block() {
        isBlocked = true;
    }

    void unblock() {
        isBlocked = false;
    }


    public int getId() {
        return id;
    }

    public double getSolde() {
        return solde;
    }

    public boolean isActive() {
        return isActive;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public String toString() {
        return "Account "+id+": "+solde+" €";
    }
}
