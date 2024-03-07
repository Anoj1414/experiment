import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class linkedexmp2  {
    public static void main(String[] args) {
        List<String> al=new ArrayList<>();
        al.add("abc");
        al.add("def");
        System.out.println(al.add("klm"));
        System.out.println(al.set(0,"ghj"));
        System.out.println(al.remove(0));
        System.out.println(al.get(0));
        //System.out.println(al.add(0,"abc")); //error
        al.add(0,"abc");
        Collections.sort(al);
        for(int i=0;i<al.size();i++){
            System.out.println(al.get(i));
        }
    }
}
