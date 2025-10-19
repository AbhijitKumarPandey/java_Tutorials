import java.util.*;
public class AddTwoNumber{
    public static void main(String args []){
        System.out.println("Enter your First Number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println("Enter Your Second Number ");
        int b = sc.nextInt();

        int c = a+b;
        System.out.println(c);
    }
}