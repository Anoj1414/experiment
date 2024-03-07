import java.util.ArrayList;
public class venkat {
    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<>();
        int b=20;
        l1.add(23);
        l1.add(25);
        check(l1,b);
        System.out.println("----------");
        for(int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }
        System.out.println(b);
    }
    public static void  check(ArrayList<Integer> m,int b){
        m.add(24);
        b=b+10;
        System.out.println(b);
        for(int i=0;i<m.size();i++){
            System.out.println(m.get(i));
        }
    }
}
