import java.util.Scanner;

public class javaEX08 {
    public static void main(String[] args) {
        int x,y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        x = sc.nextInt();
        System.out.println("enter the second number");
        y = sc.nextInt();
        System.out.println(x+y + " Sum");
        System.out.println((x+y)/2 + " Average");
        System.out.println(x*y + " Multi");
        System.out.println(x-y + " Sub");
        try {
            System.out.println(x%y + " Modulus");
            System.out.println(x/y + " Divide");

        }catch(Exception e)
        {
            System.out.println("Divide by Zero PLEASE ENTER THE CORRECT NUMBER" );
        }
    }
}
