package basics;

// Make a Decision with If and else

public class ifElseConditions {
    public static void main(String[] args) {
        int age = 17;// Write age here
        if(age >= 18) { // Write an if statement that checks if age >= 18
            System.out.println("Yes he is allowed to vote"); // If true, print "Allowed to vote" inside the if block
        } else {  // Write an else statement
            System.out.println("He is not allowed to vote");  // Inside the else block, print "Not allowed to vote"
        }

        // ---------------------------Make a Decision with If and else if-----------------------------------------------------------

//        int time = 21;// Write time here
//        if(time < 12) { // Write an if statement that checks if time < to assign value
//            System.out.println("Good Morning Buddy!"); // If true, print the assign value
//        } else if(time < 18) {  // if, if condition is false check else if condition and is it true, then print otherwise check next
//            System.out.println("Good Afternoon");
//        } else {   // if all above condition is false then print else condition
//            System.out.println("Good evening");
//        }

        // ---------------------------Make a Decision with If...else (Ternary Operator)---------------------------

        /*int time = 13;
        String message = (time <= 12) ? "Good Morning!" : "Good Afternoon";
        System.out.println(message);*/

       // ---------------------------Make a Decision with nested if  ---------------------------

//        int age = 18;
//        boolean isCitizen = true;
//
//        if(age >= 18) {
//            System.out.println("You are allowed to vote");
//             if(isCitizen) {
//                System.out.println("And you are a citizen, so you can vote!");
//                } else {
//                 System.out.println("But you must be a citizen to vote");
//                }
//        } else {
//            System.out.println("You not allowed to vote!");
//        }


    }
}
