package Loops;

// print natural number for given limits

public class NaturalNum {

    public void printNaturalNum(int limit){

        for (int i = 1; i <= limit; i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        NaturalNum myNo = new NaturalNum();

        System.out.println("Total natural no upto: 15 ");
        myNo.printNaturalNum(15);
    }
}
