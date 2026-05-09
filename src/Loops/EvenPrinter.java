package Loops;

//filter even numbers using loop for given limited number

public class EvenPrinter {

    public void printEvens(int number){

        for (int i = 1; i <= number; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        EvenPrinter e1 = new EvenPrinter();

        System.out.println("Printing evens up to 10:");
        e1.printEvens(10);
    }
}
