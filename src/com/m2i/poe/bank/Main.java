package com.m2i.poe.bank;

public class Main {

    public static void main(String[] args) {
        Account a1 = new Account();
        a1.deposit(100);
        System.out.println(a1.getSolde());
        double d = a1.withdraw(50);
        System.out.println(a1.getSolde());
        d = a1.withdraw(100);
        System.out.println(d);
        a1.block();
        d = a1.withdraw(1);
        System.out.println(d);
        a1.close();
        System.out.println(a1);
    }
}
