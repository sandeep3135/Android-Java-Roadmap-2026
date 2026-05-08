package basics;

//solve NumberChecker with negative and even/odd logic.

public class NumberChecker {

    public void checkNumber(int num){

        if (num < 0){
            System.out.println("Negative number");
        }else if (num % 2 == 0){
            System.out.println("Number is Even: ");
            if (num % 10 == 0) {
                System.out.println("Special Multiplier!");
            }
        } else{
            System.out.println("Number is Odd");
        }
    }

    public static void main(String[] args) {

        NumberChecker myNum = new NumberChecker();

        System.out.println("Checking Num:9 ");
        myNum.checkNumber(9);

        System.out.println("Checking Num:14 ");
        myNum.checkNumber(14);

        System.out.println("Checking Num:-11 ");
        myNum.checkNumber(-11);

        System.out.println("Checking Num:50 ");
        myNum.checkNumber(50);

    }
}
