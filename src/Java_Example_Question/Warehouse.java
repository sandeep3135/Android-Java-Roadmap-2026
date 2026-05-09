package Java_Example_Question;

//Stock inventory management with loops and array

public class Warehouse {


    public void checkStock(int[] quantities){

        int outOfStockCount = 0;  // this variables for out of stock count

        for (int i = 0; i < quantities.length; i++){
            if (quantities[i] == 0){     // check all the items in list by their index position one by one
                System.out.println("Product at index ["+ i +"} Out of Stock");
                outOfStockCount++;    //out of stock add count
            }
        }
        System.out.println();
        System.out.println("total products are empty: "+ outOfStockCount);
    }

    public static void main(String[] args) {

        Warehouse myWh = new Warehouse();

        int[] stock = {10, 0, 5, 0, 2, 0, 0, 0, 12};    // This is how you create an array to "pass" into the method
        myWh.checkStock(stock);
    }
}
