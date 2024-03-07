import java.util.Scanner;

public class JavaEx10 {
    public static void main(String[] args) {
        System.out.println("Enter the string " );
        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        char x[] = str.toCharArray();
        int ln=0;
        String output = "";
        String word = "";
        for(char c : x)
        {
            if(c==' '){
                output = word+" "+output;
                word = "";
                continue;
            }
            word+=c;
        }
        output = word+" "+output;
        System.out.println(output);
    }
}
