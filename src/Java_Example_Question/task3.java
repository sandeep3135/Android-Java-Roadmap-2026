package Java_Example_Question;

/*Task 3: Inventory Overflow Safety
This task is about understanding memory limits. In industrial systems (like those tracking millions of parts), picking a data type that is too small can cause a system crash called an "overflow."

The Scenario: You are managing a global inventory database. You have one variable for the total number of items worldwide (billions) and another for a simple warehouse category ID (1-100).

Requirement: 1.  Declare a long variable called globalStock and set it to 3000000000L (Note: You must put an L at the end of the number so Java knows it's a long).
        2.  Declare a byte variable called categoryId and set it to 55.

Goal: 1.  Print both values.
2.  In a comment (//), explain why we used long for the stock instead of a standard int.*/

public class task3 {
    public static void main(String[] args) {

        long globalStock = 3000000000L;
        byte categoryId = 55;

        System.out.println(globalStock);
        System.out.println(categoryId);

        //                System.out.printf("%s\n%s", globalStock, categoryId);

    }
}

