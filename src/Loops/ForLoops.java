package Loops;

import java.util.Scanner;

// Find table of any number

public class ForLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
//
//        for(int i = 1; i <= 10; i++) {
//            System.out.println(n+" * "+i+" = "+n*i);
//        }

        // Sum of any natural number
        int sum = 0;
        for(int i = 0; i <=n; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of number = "+sum);
    }
}
