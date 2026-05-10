package Java_Example_Question;

//implement find max value search algorithm for arrays

public class Market {

    public void findMax(double[] price){
        double max = price[0];
        for (int i = 0; i < price.length; i++){   // check complete array list
            if (price[i] > max){      // if price is grater than max found
                max = price[i];      // max is set the highest price found in list
            }
        }
            System.out.println("Highest price found is: $" + max);
    }


    public static void main(String[] args) {

        Market myM = new Market();

        double[] prices = {-12.0, -20.0, -150.0, -35.0, -49.0};
        myM.findMax(prices);
    }
}
