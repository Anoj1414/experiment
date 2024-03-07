import java.util.Scanner;

public class JavaEx9 {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a= s.nextInt();
        double b=((Math.sqrt(3))*3)/2;
        double b1=b*a*a;
        System.out.println(String.format("%.3f",b1));
    }
}
