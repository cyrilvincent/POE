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

//        a1.block();
//        d = a1.withdraw(1);
//        System.out.println(d);
//        a1.close();
//        System.out.println(a1);
        Customer c1 = new Customer(0,"Cyril","Vincent");
        a1.setCustomer(c1);
        Account a2 = new Account(0,c1);
        Account a3 = new Account(1, new Customer(1,"toto","titi"));
        for(Transaction transaction : a1.getTransactionList()) {
            System.out.println(transaction);
        }
        a1.transfer(20, a2);
        System.out.println(a1.getNbAccount());
    }
}
