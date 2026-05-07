package OOPS;

// use of final keywords or modifier

public class Ques8 {

    public static void main(String[] args) {
        Boy b1 = new Boy();
      //  b1.age = 24; //// will generate an error: cannot assign a value to a final variable
        System.out.println("name: "+ b1.name + " " +"age: "+ b1.age);
    }
}

class Boy{
    final int age = 21;
    final String name = "ishan";
}