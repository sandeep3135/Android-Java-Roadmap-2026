package Function;

// find factorial of a given no:

import java.util.Scanner;

public class ques3 {

    public static void printFactorial(int a) {
        int factorial = 1;

        for (int i = a; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

      printFactorial(a);
    }
}
