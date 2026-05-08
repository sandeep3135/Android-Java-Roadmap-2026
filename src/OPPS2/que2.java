package OPPS2;

//Encapsulation uses of get and set method

public class que2 {


}

class Person {

    private String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }
}



class Boy{

    public static void main(String[] args) {
        Person obj = new Person();
        obj.setName("Ishan");
        obj.age = 21;
        System.out.println(obj.getName() + " " + obj.age);
    }
}

