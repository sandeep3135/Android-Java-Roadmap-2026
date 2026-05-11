package Java_Example_Question;

// implement add interest Rate for child class and access data from parents class BankManager

public class SavingsAccount extends BankManager{

    double interestRate;

    public SavingsAccount(String accountHolder, double balance, double interestRate){
        super(accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        // 1. Calculate the actual dollar amount earned
        double interestAmount = getBalance() * interestRate;

        // 2. Update the protected balance
        this.balance += interestAmount;

        // 3. Print the confirmation using the amount we just calculated
        System.out.println("Deposit Interest Amount Successfully: +$" + interestAmount);

    }

    public static void main(String[] args) {

        //  Only ONE array needed for the whole bank!
        BankManager[] bank = new BankManager[4];

        // You can put both types in the same array
        bank[0] = new BankManager("Ishan", 500);
        bank[1] = new SavingsAccount("pj", 300, 0.08);
        bank[2] = new SavingsAccount("paj", 200, 0.04);
        bank[3] = new SavingsAccount("pkj", 400, 0.06);

        //Automated batch processing using loops and parallel data arrays for transaction amounts.
        double[] deposits = {50.0, 1000.0, 0, 100.0};
        double[] withdrawals = {50.0, 0, 100.0, 0.0};

        //  Loop through the SINGLE list
        for (int i = 0; i < bank.length; i++) {
            if (bank[i] != null) { // Rule #1: Check if slot is empty

                // Check if it's a SavingsAccount before adding interest
                if (bank[i] instanceof SavingsAccount) {
                    // We "cast" the account to tell Java: "Treat this as a SavingsAccount"
                    SavingsAccount sa = (SavingsAccount) bank[i];
                    sa.addInterest();
                }

                // Everyone can deposit because it's in the Parent class
                //bank[i].deposit(100);
                //Automated batch processing using loops and parallel data arrays for transaction amounts.
                //Handle the specific deposit from our "choice" array
                bank[i].deposit(deposits[i]);
                //Handle the specific deposit from our "choice" array
                bank[i].withdraw(withdrawals[i]);

                // Print the details
                System.out.println("Customer: " + bank[i].getAccountHolder() +
                        " | Final Balance: $" + bank[i].getBalance());
                System.out.println("--------------------");
            }
        }
    }
}
