package OOPS;

//Create a Car object named myCar. Call the fullThrottle() and speed() methods on the myCar object, and run the program:

public class Ques2 {

    public void FullThrottle(){
        System.out.println("The car is going as fast as it can!");
    }

    public void speed(int a){
        System.out.println("max speed: "+a);
    }

    public static void main(String[] args) {

        Ques2 myCar = new Ques2();
        myCar.FullThrottle();
        myCar.speed(150);
    }
}
