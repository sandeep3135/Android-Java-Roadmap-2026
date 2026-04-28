package Java_Example_Question;

/*Task 5: Batch Variable Initializer

The Scenario: You are calculating the storage volume required for a shipping container in a warehouse.

Requirement: On one single line, initialize three int variables: width = 10, height = 20, and depth = 30.

Goal: 1. Calculate the volume: width * height * depth.
2. Print: "Container Volume: [result] cubic meters".*/

public class task5 {
    public static void main(String[] args) {

        int width =10, height = 20, depth = 30;

        int volume = width * height * depth;

        System.out.print("Container Volume: " + volume + " cubic meters");

    }
}
