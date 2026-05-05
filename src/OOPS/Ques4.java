package OOPS;

//pass many parameters as you want in constructor:

import java.sql.SQLOutput;

public class Ques4{

   String name;
    int age;

    public Ques4(String name1, int age1) {
        name = name1;
         age = age1;
    }



    public static void main(String[] args) {

        Ques4 s1 = new Ques4("Sandeep", 21);
        System.out.println(s1.name +" " + s1.age);
    }
}
