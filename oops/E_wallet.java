package oops;

public class E_wallet {
    // Interface
interface Transferable {
    void transferTo(User receiver, double amount);
}
// Base Wallet class
abstract class Wallet implements Transferable {
    private double balance;
    public Wallet(double initialBalance) {
        this.balance = initialBalance;
    }
    public double getBalance() {
        return balance;
    }
    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public void loadMoney(double amount) {
        setBalance(getBalance() + amount);
    }

    public abstract void transferTo(User receiver, double amount);
}
class PersonalWallet extends Wallet {
    private static final double MAX_TRANSFER = 5000;

    public PersonalWallet(double initialBalance) {
        super(initialBalance);
    }
    public void transferTo(User receiver, double amount) {
        if (amount <= MAX_TRANSFER && amount <= getBalance()) {
            setBalance(getBalance() - amount);
            receiver.getWallet().loadMoney(amount);
            System.out.println("Transferred ₹" + amount + " to " + receiver.getName());
        } else {
            System.out.println("Transfer failed: Limit exceeded or insufficient balance.");
        }
    }
}
// BusinessWallet with higher limit and tax
class BusinessWallet extends Wallet {
    private static final double MAX_TRANSFER = 10000;
    private static final double TAX_RATE = 0.02;  // 2%

    public BusinessWallet(double initialBalance) {
        super(initialBalance);
    }
    @Override
    public void transferTo(User receiver, double amount) {
        double tax = amount * TAX_RATE;
        double total = amount + tax;

        if (amount <= MAX_TRANSFER && total <= getBalance()) {
            setBalance(getBalance() - total);
            receiver.getWallet().loadMoney(amount);
            System.out.println("Transferred ₹" + amount + " to " + receiver.getName() + " with ₹" + tax + " tax.");
        } else {
            System.out.println("Transfer failed: Limit exceeded or insufficient balance.");
        }
    }
}

class User {
    private String name;
    private Wallet wallet;

    public User(String name, Wallet wallet, boolean hasReferral) {
        this.name = name;
        this.wallet = wallet;
        if (hasReferral) {
            wallet.loadMoney(100); // Referral bonus
        }
    }
    public String getName() {
        return name;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void viewBalance() {
        System.out.println(name + "'s balance: ₹" + wallet.getBalance());
    }
}
public class EWalletApp {
    public static void main(String[] args) {
        User person1 = new User("person1", new PersonalWallet(1000), true);
        User person2 = new User("person2", new BusinessWallet(5000), false);

        person1.viewBalance(); // ₹1100
        person2.viewBalance();   // ₹5000

        person1.getWallet().transferTo(person2, 500);
        person2.getWallet().transferTo(person1, 1000);

        person1.viewBalance();
        person2.viewBalance();
    }
}
}

    
    

