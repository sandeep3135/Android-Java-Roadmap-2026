package Loops;

// print a number in reverse order from a given starting point of a number

import java.util.concurrent.Callable;

public class Countdown {

    public void startCount(int start){

        for (int i = start; i >= 0; i--){
            if (i == 0) {
                System.out.println("Blast off! 🚀");
            } else {
                System.out.println(i);
            }
        }
    }


    public static void main(String[] args) {

        Countdown myC = new Countdown();

        System.out.println("Reverse number count from:15 ");
        myC.startCount(15);
    }
}
