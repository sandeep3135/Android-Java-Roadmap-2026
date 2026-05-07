package OOPS;

// use of static modifiers call it without creating an object of the class.

public class Ques9 {

    static void staticMethod(){

        System.out.println("Static methods can be called without creating objects");
    }

    public static void main(String[] args) {

        staticMethod();  // Call the static method
        Ques9.staticMethod();  // Or call it using the class name
    }
}
