package basics;

// the simple calculator operation performed

public class SimpleCalc {


    public void operate(double n1, double n2, char operator){

        switch (operator){
            case 'a':
                System.out.println("sum: " + (n1 + n2));
                break;
            case 'b':
                System.out.println("Minus: " + (n1 - n2));
                break;
            case 'c':
                System.out.println("Multiply: " + (n1 * n2));
                break;
            case 'd':
                if (n2 == 0){
                    System.out.println("Error: Cannot divide by zero!");
                } else {
                    System.out.println("Divide: " + (n1 / n2));
                }
                break;
            default:
                System.out.println("Error: Invalid operation choice.");

        }

    }


    public static void main(String[] args) {
        SimpleCalc myCalc = new SimpleCalc();

        myCalc.operate(5, 5, 'a');

        myCalc.operate(5, 7, 'b');

        myCalc.operate(5, 5, 'c');

        myCalc.operate(5, 0, 'd');

    }
}
