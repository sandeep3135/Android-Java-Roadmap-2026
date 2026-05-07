package OOPS;

// use of abstract method in abstract class

public class Ques10 {

}

// abstract class
abstract class Boy1 {
    public String fName= "John";
    public int age = 24;
    public abstract void study(); // abstract method
}

// Subclass (inherit from Main)
class Student extends Boy1 {
    public int graduationYear = 2018;
    public void study() { // the body of the abstract method is provided here
        System.out.println("Studying all day long");
    }
}


// Code from filename: Second.java
class Second {
    public static void main(String[] args) {
        // create an object of the Student class (which inherits attributes and methods from Main)
        Student myObj = new Student();

        System.out.println("Name: " + myObj.fName);
        System.out.println("Age: " + myObj.age);
        System.out.println("Graduation Year: " + myObj.graduationYear);
        myObj.study(); // call abstract method
    }
}