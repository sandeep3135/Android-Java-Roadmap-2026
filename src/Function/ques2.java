package Function;

//using the function return the output value is double of the given number:

import java.util.Scanner;

public class ques2 {

    public static int doubleGame(int a) {
        return a * 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();


        int myDouble = doubleGame(a);
        System.out.println(myDouble);

    }
}
