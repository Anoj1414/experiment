import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class removelistelements {
    public static void main(String[] args) {
        List<Integer> l1=new ArrayList<>();
        l1.add(1);
        l1.add(2);
        ListIterator<Integer> l2=l1.listIterator();
        while (l2.hasNext()){
            l2.next();
           l2.add(21);
            l1.remove((Integer)1);
        }
        System.out.println(l1);
    }
}
