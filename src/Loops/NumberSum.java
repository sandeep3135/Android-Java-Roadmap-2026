package Loops;

// sum of a given limit of no

public class NumberSum {

    public void sumUpTo(int limit){

        int sum = 0;

        for (int i = 0; i <= limit; i++)
            sum += i;
        System.out.println("Sum of no: "+ sum);
    }

    public static void main(String[] args) {

        NumberSum mySum = new NumberSum();

        mySum.sumUpTo(5);
    }
}
