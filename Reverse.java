import java.util.Scanner;
class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter name:");
        String s = sc.nextLine();
        String rev = new StringBuilder(s).reverse().toString();
        System.out.println(rev);
    }
}
