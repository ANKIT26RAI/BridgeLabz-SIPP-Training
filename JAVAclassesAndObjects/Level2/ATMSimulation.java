package com.studyopedia.JavaClassandObject.Level2;


public class ATMSimulation {
    String accountHolder;
    String accountNumber;
    double balance;

    public ATMSimulation(String holder, String number, double balance) {
        this.accountHolder = holder;
        this.accountNumber = number;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        ATMSimulation account = new ATMSimulation("Ankit", "1234567890", 10000);
        account.deposit(5000);
        account.withdraw(3000);
        account.displayBalance();
    }
}

