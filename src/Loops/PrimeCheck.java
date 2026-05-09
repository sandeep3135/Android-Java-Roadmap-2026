package Loops;

// Check the given no is prime or not

public class PrimeCheck {

    public void isPrime(int number){

        boolean isPrime = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(number + " is a Prime number.");
        } else {
            System.out.println(number + " is NOT a Prime number.");
        }
    }



    public static void main(String[] args) {

        PrimeCheck myP = new PrimeCheck();

        myP.isPrime(47);
    }
}
