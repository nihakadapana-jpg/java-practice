import java.util.Scanner;
class Palindrome{
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
       System.out.print("Enter Name:");
        String s=sc.nextLine();
        boolean flag=true;

        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                flag=false;
                break;
            }
        }

        if(flag)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
