package Array;


//a practical example of using arrays, let's create a program that calculates the average of different ages:

public class ques3 {
    public static void main(String[] args) {
        int[] ages = {12, 10, 14, 16, 20};
        int avg, sum =0;


        for (int age : ages) {
           sum += age;
        }
        avg = sum / ages.length;
        System.out.println("Average of age: " + avg);
    }

}
