package Java_Example_Question;

//create first Java class and objects for Smartphone simulation

public class Smartphone {

    String brand;
    int modelYear;
    double storageGB;

    public void displayInfo(){

        System.out.println("Phone name: "+brand+ ", Model Year: "+modelYear+", Storage Capacity: "+storageGB+"GB");
        //System.out.println();
    }

    public static void main(String[] args) {

        Smartphone phone1 = new Smartphone();
        phone1.brand = "Nokia";
        phone1.modelYear = 2000;
        phone1.storageGB = 1.0;

        Smartphone phone2 = new Smartphone();
        phone2.brand = "Samsung";
        phone2.modelYear =2004;
        phone2.storageGB = 5.0;

        phone1.displayInfo();
        phone2.displayInfo();
    }
}
