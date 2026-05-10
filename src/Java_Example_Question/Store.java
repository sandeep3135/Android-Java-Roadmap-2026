package Java_Example_Question;

//implement store discount using array and loops update the price

public class Store {

    public void applyDiscount(double[] price){

        double[] updatedPrice = new double[price.length];  // for updated price store with same size array

        for (int i = 0; i < price.length; i++){
            if (price[i] > 150) {      // check price if above 150 then apply discount
                updatedPrice[i] = price[i] * 0.90;           // apply discount
            }else {
                updatedPrice[i] = price[i];     // store price as it is in new array those are not more then 150
            }
        }
        for (int i = 0; i < updatedPrice.length; i++) {    // check updated price and print below
            System.out.println("Offer price: $" + updatedPrice[i]);
        }
    }

    public static void main(String[] args) {

            Store myS = new Store();

        double[] prices = {100.0, 50.0, 200.0, 150.0, 163.0, 250.0};
        myS.applyDiscount(prices);
    }
}
