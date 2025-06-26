
public class bank_Account {
    static String bankName = "OpenAI Bank";
    private static int totalAccounts = 0;

    private final String accountNumber;
    private String accountHolderName;

    public bank_Account(String accountHolderName, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public void display() {
        if (this instanceof bank_Account) {
            System.out.println("Bank: " + bankName);
            System.out.println("Holder: " + accountHolderName);
            System.out.println("Account #: " + accountNumber);
            System.out.println();
        }
    }
}


