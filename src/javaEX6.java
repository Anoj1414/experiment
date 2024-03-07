import java.util.Scanner;
public class javaEX6 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        double timeInMinutes = s.nextInt();
        long timeInYears = (long)timeInMinutes/(60*24*365);
        int timeInDays = (int)(timeInMinutes/(60*24))%365;
        System.out.println("Time in Years and days " + timeInYears + " year" +" "+ timeInDays + " Days");
    }
}
