import java.util.ArrayList;
import java.util.Scanner;
//import static jdk.internal.org.jline.utils.Colors.s;
public class Assignment1 {

    public static void main(String args[])
            throws java.io.IOException {
        ArrayList<String> l1=new ArrayList<>();
        ArrayList<String> l2=new ArrayList<>();
        l2.add("");
        l2.add("");
        int idl=1;
        int dos=1;
        int choice;
        Scanner sc = new Scanner(System.in);
        while(true)
        {

            System.out.println("\n\n----------Welcome to Southern Kitchen\nToday's Menu Items---------");
//            System.out.println("  1. Idly");
//            System.out.println("  2. Dosa");
//            System.out.println("  3. Chapati");
//            System.out.println("  4. Bhindi");
//            System.out.println("  5. Coffee");
//            System.out.println("  6. Exit From Menu...\n");
            System.out.println("Choose one:");
            choice = sc.nextInt();
            System.out.println("");
            System.out.println("user cart");
            switch(choice) {
                case 1:
                    //for (int i = 0; i < 0; i++){
                    // String s= "User Cart : Idly    *   1";
                    // System.out.println("User Cart : Idly * 1" + choice);
                    //  System.out.println("User Cart : Idly * 1" + s);
                    //}
                    int j=1;

                    //String a="Idly* "+j;
                    int c=cartcon(l1,"Idly");
                    //System.out.println(c);
                    j=c+2;
                    String a="Idly* "+idl;
                    //System.out.println(c);
                    if(c==-1){
                    l1.add(a);
                        System.out.println(l1.size());
                        l2.set(0,l1.get((l1.size())-1));
                    }
                    else{
                        //l1.remove(c);
                        l1.add(a);

                        l2.set(0,l1.get((l1.size())-1));
                    }
                    //System.out.println(l1.size());
                    //System.out.println("User Cart : Idly  *  1\n");
                    for(int i=0;i<l2.size();i++){
                        System.out.println(l2.get(i));
                    }
                    idl++;
                    break;
                case 2:
                    int c1=cartcon(l1,"Dosa");
                    //System.out.println(c1);
                    j=c1+2;
                    String a1="Dosa* "+dos;
                    //System.out.println(c);
                    if(c1==-1){
                        l1.add(a1);
                        System.out.println(l1.size());
                        l2.set(1,l1.get((l1.size())-1));
                    }
                    else{
                        //l1.remove(c);
                        l1.add(a1);

                        l2.set(1,l1.get((l1.size())-1));
                    }

                    //l1.add("dosa* 1");
                    //System.out.println("User Cart : Dosa    *   1\n");
                    for(int i=0;i<l2.size();i++){
                        System.out.println(l2.get(i));
                    }
                    dos++;
                    break;
//                case 3:
//                    System.out.println("User Cart : Chapati    *   1\n");
//                    break;
//                case 4:
//                    System.out.println("User Cart : Bhindi    *   1\n");
//                    break;
//                case 5:
//                    System.out.println("User Cart : Coffee    *   1\n");
//                    break;
                case 6:
                    return;
            }
        }
    }
    public static int cartcon(ArrayList<String> l1,String a){
        int m3=-1;
        for(int m=0;m<l1.size();m++){
            String m2=l1.get(m);
            String[] m1=m2.split("\\*");
            if(m1[0].equals(a)){
                m3=m;
            }
        }
        return m3;
    }

}