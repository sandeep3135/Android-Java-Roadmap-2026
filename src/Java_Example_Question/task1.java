package Java_Example_Question;

/*Task 1: Professional Profile Formatter
The Scenario: You are building a backend system for a manufacturing company. You need to take raw employee data and print a clean, professional summary for the HR dashboard.

        Requirement: 1. Declare a String variable for a name (e.g., "Sandeep").
        2. Declare an int variable for age (e.g., 28).
        3. Declare a double variable for an hourly rate (e.g., 45.50).

Goal: Use a single System.out.println() to output the result in this exact format:
User: Sandeep | Age: 28 | Rate: $45.5/hr*/

public class task1 {
    public static void main(String[] args) {
        String name = "Sandeep";
        int age = 28;
        double hourlyRate = 45.50;

//        System.out.println(name + " | "+"Age: "+ age + " | " + "Rate: $" + hourlyRate+"/hr");
          System.out.printf("User: %s | Age: %d | Rate: $%.2f/hr\n", name, age, hourlyRate);
    }
}
