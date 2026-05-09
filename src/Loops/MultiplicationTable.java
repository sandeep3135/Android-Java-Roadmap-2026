package Loops;

//Create multiplication table using for-loop

public class MultiplicationTable {


    public void printTable(int number){


        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number*i));
        }
    }

    public static void main(String[] args) {

        MultiplicationTable myTable = new MultiplicationTable();

        System.out.println("Table of 2:");
        myTable.printTable(2);
    }

}
