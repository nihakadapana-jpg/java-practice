class Employee {
    int salary = 20000;
}
class Programmer extends Employee {
    int bonus = 5000;
    void display() {
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + bonus);
    }
}
public class Main {
    public static void main(String[] args) {
        Programmer p = new Programmer();
        p.display();
    }
}
