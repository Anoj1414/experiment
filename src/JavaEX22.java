import java.util.Scanner;
public class JavaEX22 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if(a<0){
            System.out.println("it is a negative number");
        } else if (a>0) {
            System.out.println("it is a postive number");

        }
        else {
            System.out.println("it is a zero");
        }
    }
}
