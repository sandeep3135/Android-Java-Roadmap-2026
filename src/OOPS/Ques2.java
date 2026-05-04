package OOPS;

public class Ques2 {

    public void fullThrottle(){
        System.out.println("The car is going as fast as it can!");
    }

    public void speed(int a){
        System.out.println("max speed: "+a);
    }

    public static void main(String[] args) {

        Ques2 myCar = new Ques2();
        myCar.fullThrottle();
        myCar.speed(150);
    }
}
