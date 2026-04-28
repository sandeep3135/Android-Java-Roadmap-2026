package Java_Example_Question;

/*Task 2: Constant Tax Calculator
This focuses on Constants and Math.

The Scenario: In the industrial sector, tax rates are often fixed by the government. You need to ensure your code uses a "locked" value that cannot be accidentally changed by another part of the program.

Requirement: 1. Use the final keyword to declare a constant double called GST_RATE and set it to 18.0.
        2. Declare a double called productPrice and set it to 5000.0.

Goal: 1. Calculate the tax amount: (productPrice * GST_RATE) / 100.
        2. Print the final tax amount.
        3. Bonus: On the next line, try to write GST_RATE = 20.0; and see what happens in your IDE (don't worry, it's supposed to show an error!).*/

public class task2 {
    public static void main(String[] args) {
        final double GST_RATE = 18.0;
        double productionPrice = 5000.0;

        double taxAmount = (productionPrice * GST_RATE) / 100;

        System.out.println(taxAmount);

    }
}
