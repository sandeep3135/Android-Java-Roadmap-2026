package basics;

public class LogicalOperators {
    public static void main(String[] args) {

        // Use && Condition when both condition is true

//        int a = 130;
//        int b = 12;
//        int c = 125;
//
//        if(a > b && a > c) {
//            System.out.println("Both are true");
//        }


        // Use || Condition when one condition is true

//        int a = 130;
//        int b = 12;
//        int c = 125;
//
//        if(a > b || b > c) {
//            System.out.println("one condition are true");
//        }


        // Use (!) to reverse a condition:

//        int a = 130;
//        int b = 12;
//
//        if(!(b > a)) {
//            System.out.println("b is not grater than a");
//        }



        // example

        boolean isLoggedIn = true;
        boolean isAdmin = false;
        int securityLevel = 3;  // 1 = highest

        if(isLoggedIn && (isAdmin || securityLevel <= 2)) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }
    }
}
