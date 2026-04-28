package Java_Example_Question;

/*Task 4: Scientific Precision Display
This task demonstrates how Java handles decimals. In technical fields like manufacturing or chemistry, the "precision" (number of digits after the decimal) can change your results.

The Scenario: You are coding a sensor for an industrial machine. The machine provides a very long decimal reading.

        Requirement: 1. Declare a float called sensorA and set it to 1.123456789f (remember the f suffix).
        2. Declare a double called sensorB and set it to 1.123456789.

Goal: Print both variables. Observe how many digits actually appear in the output for each.

Industry Skill: Understanding that double is twice as precise as float (64-bit vs 32-bit), which is why double is the industry standard for most calculations.*/

public class task4 {
    public static void main(String[] args) {
        float sensorA = 1.123456789f;
        double sensorB = 1.123456789d;

        System.out.println(sensorA);
        System.out.println(sensorB);

//        System.out.printf("%s\n%s", sensorA, sensorB);
    }
}
