class BankAccount {
    private double balance;
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    void deposit(double amount) {
        balance = balance + amount;
    }
    void display() {
        System.out.println("Balance: " + balance);
    }
}
public class Main {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.setBalance(1000);
        b.deposit(500);
        b.display();
    }
}
