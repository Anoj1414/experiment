import java.util.Scanner;

class lengthwithout {
    public static void main(String[] args) {


    Scanner s = new Scanner(System.in);
    String s1 = s.nextLine();

    int l=0;
    s1 = s1 + '\0';
        for (int j = 0; (s1.charAt(j)) != '\0'; j++) {
        l = l + 1;
    }
        System.out.println("length of the string is+ " +l);
    }
}

