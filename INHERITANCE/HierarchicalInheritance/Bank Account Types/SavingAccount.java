package inheritance.HierarchicalInheritance;

public class SavingAccount extends BankAccount {
    double interestRate;

    public SavingAccount(String accNo, double balance, double rate) {
        super(accNo, balance);
        this.interestRate = rate;
    }

    void displayAccountType() {
        System.out.println("Savings Account - Interest Rate: " + interestRate + "%");
    }

    public static void main(String[] args) {
        SavingAccount sa = new SavingAccount("SA123", 10000, 4.5);
        sa.displayAccountType();
    }
}

