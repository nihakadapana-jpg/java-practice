interface Payment {
    void pay();
}
class CreditCard implements Payment {
    public void pay() {
        System.out.println("Payment through Credit Card");
    }
}
class UPI implements Payment {
    public void pay() {
        System.out.println("Payment through UPI");
    }
}
public class Main {
    public static void main(String[] args) {
        Payment p;

        p = new CreditCard();
        p.pay();

        p = new UPI();
        p.pay();
    }
}
