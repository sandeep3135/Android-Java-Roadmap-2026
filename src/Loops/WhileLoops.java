package Loops;

import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
//        int i = 0;
//
//        while (i < 5) {
//            System.out.println(i);
//            i++;
//        }

        Scanner sc = new Scanner(System.in);
        boolean hasLearnt = false;

        while (!hasLearnt) {
            System.out.println("Went to school, trie to learn");
            System.out.println("Have you learn");
            hasLearnt = sc.nextBoolean();
        }
    }
}
