package OOPS;



public class Ques6 {

    String modalName;
    int modalYear;

    // Constructor with one parameter
    public Ques6(String modalName) {
        this(modalName, 2021);
    }

    // Constructor with two parameters
    public Ques6(String modalName, int modalYear) {
       this.modalName = modalName;
       this.modalYear = modalYear;

    }

    // Method to print car information
    public void printInfo(){
        System.out.println(modalYear + " " + modalName);

    }


    public static void main(String[] args) {

        Ques6 car1 = new Ques6("Honda", 2123);
        Ques6 car2 = new Ques6("Mustang");

        car1.printInfo();
        car2.printInfo();

    }
}
