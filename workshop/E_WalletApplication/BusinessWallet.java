package workshop.E_WalletApplication;

import java.util.ArrayList;
import java.util.List;

public class BusinessWallet {
    protected User owner;
    protected boolean hasReferral;
    protected double balance;
    protected List<String> transactionHistory;

    public BusinessWallet(User owner, boolean hasReferral) {
        this.owner = owner;
        this.hasReferral = hasReferral;
        this.balance = 0;
        this.transactionHistory = new ArrayList<>();
    }

    public User getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public void loadMoney(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid load amount.");
            return;
        }
        balance += amount;
        transactionHistory.add("Loaded ₹" + amount);
        System.out.println("Successfully loaded ₹" + amount);
    }

    public void deduct(double amount, String description) {
        if (amount > balance) {
            System.out.println("Insufficient balance.");
            return;
        }
        balance -= amount;
        transactionHistory.add("Deducted ₹" + amount + " (" + description + ")");
    }

    public void credit(double amount, String description) {
        balance += amount;
        transactionHistory.add("Credited ₹" + amount + " (" + description + ")");
    }

    public void printTransactionHistory() {
        System.out.println("\nTransaction History for " + owner.getName() + ":");
        for (String record : transactionHistory) {
            System.out.println(record);
        }
    }

    public boolean transferTo(User receiver, double amount) {
        System.out.println("Default Wallet transferTo() called. Override in subclasses.");
        return false;
    }
}
