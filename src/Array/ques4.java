package Array;

//Create a program that keeps track of the highest and lowest ages in an array:

public class ques4 {
    public static void main(String[] args) {
        int[] ages = {12, 16, 18, 20, 8};
        int min = ages[0];
        int max = ages[0];

        for (int n : ages) {
            if (n > max) {
                max = n;
            }
            if (n < min) {
                min = n;
            }
        }
        System.out.println("The max age is: " + max);
        System.out.println("The min age is: " + min);



    }
}
