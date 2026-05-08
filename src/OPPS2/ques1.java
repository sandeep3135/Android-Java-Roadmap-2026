package OPPS2;

//the Car class (subclass) inherits the attributes and methods from the Vehicle class (superclass):

public class ques1 {
}


class vehicles{
    protected String brand = "Ford";

    public void honk(){
        System.out.println("Piii, piii!");
    }
}

class Car extends vehicles{
    private String modelName = "Mustang";

    public static void main(String[] args) {

        Car obj = new Car();

        obj.honk();   // here, method call from vehicles to car on object
        System.out.println(obj.modelName + " " + obj.brand);

    }
}