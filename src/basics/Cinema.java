package basics;

// The Cinema Ticket Price Calculator for different age group

public class Cinema {

   public void calculatePrice(int age, boolean isSunday){

       int finalPrice;

       if (age <= 13 || age >= 60) {
           finalPrice = 7;
       }else{
           finalPrice = 10;
           }
       if (isSunday){
           finalPrice += 2;
       }
       System.out.println("Final Ticket Price for age " + age + (isSunday ? " (Sunday): " : " (Weekday): ") + "$" + finalPrice);
   }


    public static void main(String[] args) {

        Cinema c1 = new Cinema();


       c1.calculatePrice(10, false); //7

       c1.calculatePrice(60, true);  //9

        c1.calculatePrice(10, true); //9

        c1.calculatePrice(40, true);  //12

        c1.calculatePrice(40, false);  //10

    }
}
