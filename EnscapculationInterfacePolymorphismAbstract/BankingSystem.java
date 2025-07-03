package com.studyopedia.EnscapculationInterfacePolymorphismAbstract;
//File: Main.java

import java.util.*;

abstract class BankAccount {
 private String accountNumber;
 private String holderName;
 private double balance;

 public BankAccount(String accNum, String holderName, double balance) {
     this.accountNumber = accNum;
     this.holderName = holderName;
     this.balance = balance;
 }

 public String getAccountNumber() { return accountNumber; }
 public String getHolderName() { return holderName; }
 public double getBalance() { return balance; }

 public void deposit(double amount) { balance += amount; }
 public void withdraw(double amount) { balance -= amount; }

 public abstract double calculateInterest();
}

interface Loanable {
 void applyForLoan(double amount);
 boolean calculateLoanEligibility();
}

class SavingsAccount extends BankAccount implements Loanable {
 public SavingsAccount(String accNum, String name, double balance) {
     super(accNum, name, balance);
 }

 public double calculateInterest() {
     return getBalance() * 0.04;
 }

 public void applyForLoan(double amount) {
     System.out.println("Savings Account Loan Requested: ₹" + amount);
 }

 public boolean calculateLoanEligibility() {
     return getBalance() > 10000;
 }
}

class CurrentAccount extends BankAccount implements Loanable {
 public CurrentAccount(String accNum, String name, double balance) {
     super(accNum, name, balance);
 }

 public double calculateInterest() {
     return 0; // No interest
 }

 public void applyForLoan(double amount) {
     System.out.println("Current Account Loan Requested: ₹" + amount);
 }

 public boolean calculateLoanEligibility() {
     return getBalance() > 50000;
 }
}

public class BankingSystem {
 public static void main(String[] args) {
     List<BankAccount> accounts = new ArrayList<>();
     accounts.add(new SavingsAccount("SAV001", "Anita", 12000));
     accounts.add(new CurrentAccount("CUR002", "Raj", 60000));

     for (BankAccount acc : accounts) {
         System.out.println("Account Holder: " + acc.getHolderName());
         System.out.println("Interest: ₹" + acc.calculateInterest());

         if (acc instanceof Loanable) {
             ((Loanable) acc).applyForLoan(30000);
             System.out.println("Eligible for loan? " + ((Loanable) acc).calculateLoanEligibility());
         }

         System.out.println("---------------------------");
     }
 }
}

