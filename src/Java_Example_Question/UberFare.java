package Java_Example_Question;

//Calculate Uber Fare price in day and night hour

public class UberFare {

    public void calculateFare(double distance, int hourOfDay){

        double totalFare = 5.00;  //if you book cap fare is 5
        totalFare +=(2.00 * distance);  // price for distance per/km

        if (hourOfDay >= 22 || hourOfDay <= 5){
            totalFare += 10.00;  //pay extra for night fee
        }if(totalFare < 10.00) {
            totalFare = 10.00;   // if your fair is less than 10 then fair is minimum 10
        }
        System.out.println("Distance: "+ distance +" Km," + " Time: " + hourOfDay + ":00");
        System.out.println("Final fare price: $" + totalFare);
    }


    public static void main(String[] args) {
        UberFare myTf = new UberFare();


        // Day time (10 AM), 5km. (Expected: 5 + 10 = $15)
        myTf.calculateFare(5, 10);

        // Night time (Midnight), 2km. (Expected: 5 + 4 + 10 = $19)
        myTf.calculateFare(2, 0);

        // Short trip (1km), Day time. (Expected: 5 + 2 = 7, but Minimum is 10)
        myTf.calculateFare(1, 14);
    }
}
