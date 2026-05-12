package Java_Example_Question;

public interface PaymentMethod {

    void pay(double amount);

}

class CreditCard implements PaymentMethod {
    public void pay(double amount){
        System.out.println("Processing Credit Card payment of: $"+ amount +"... Success!");
    }

}

class UPI implements PaymentMethod{
    @Override
    public void pay(double amount){
        System.out.println("Scanning QR for UPI payment of: $"+ amount +"... Done!");
    }
}
class main{
    public static void main(String[] args) {

        PaymentMethod myPayment;
        myPayment = new UPI();

        myPayment.pay(400);
        myPayment = new CreditCard();
        myPayment.pay(900);

    }
}