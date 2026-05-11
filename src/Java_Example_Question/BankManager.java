package Java_Example_Question;

//implement fully encapsulated BankManager with object array processing

public class BankManager {
    private String accountHolder;
    protected double balance;

    public BankManager(String accountHolder, double balance){
        this.accountHolder = accountHolder;
        // Logic check: Balance shouldn't start negative
        this.balance = (balance > 0) ? balance : 0;
    }

    public void deposit(double amount){
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit for " + accountHolder + ": +$" + amount);
        } else {
            System.out.println("Invalid deposit for " + accountHolder);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal for " + accountHolder + ": -$" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient funds for " + accountHolder + "!");
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }

    public double getBalance(){
        return balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public static void main(String[] args) {
        // 1. Create the data list
        BankManager[] allAccount = new BankManager[4];
        allAccount[0] = new BankManager("Ishan", 500);
        allAccount[1] = new BankManager("Raj", 800);
        allAccount[2] = new BankManager("Amit", 300);
        allAccount[3] = new BankManager("Sandeep", 1000);

        // 2. Perform actions
        allAccount[0].deposit(200);
        allAccount[3].deposit(50);

        System.out.println("\n--- FINAL BANK REPORT ---");

        // 3. Loop through to see EVERYONE'S unique data
        for (int i = 0; i < allAccount.length; i++) {
            System.out.println("Customer: " + allAccount[i].getAccountHolder() +
                    " | Balance: $" + allAccount[i].getBalance());
        }
    }
}

