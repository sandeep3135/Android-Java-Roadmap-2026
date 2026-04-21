package basics;

//Customer Menu Order

public class SwitchCase {
    public static void main(String[] args) {
        int choice = 4;

        switch (choice) {
            case 1:
                System.out.println("Tea");
                break;
            case 2:
                System.out.println("Coffee");
                break;
            case 3:
                System.out.println("Shake");
                break;
            case 4:
                System.out.println("Cold drinks");
                break;
            case 5:
                System.out.println("Chines");
                break;
            case 6:
                System.out.println("Momo");
                break;
            case 7:
                System.out.println("Noodle");
                break;
            default:
                System.out.println("Invalid Ordered choice");
        }
    }
}
