package Java_Example_Question;

//implement Account class with private fields and encapsulation

public class Account {

    private String accountHolder;
    private double balance;


    public Account(String accountHolder, double balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount){
        if (amount > 0) {
            balance += amount;
        }
        System.out.println("Account Holder Name: " + accountHolder);
    }

    public double getBalance(){
        return balance;

    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public static void main(String[] args) {

        Account myAcc = new Account("Sandeep",1000);

        myAcc.deposit(500);
        myAcc.getBalance();


        System.out.println("Account Balance: $" + myAcc.getBalance());
    }

}

