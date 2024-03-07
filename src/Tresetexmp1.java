import java.util.Comparator;
import java.util.TreeSet;

public class Tresetexmp1 {
    public static void main(String[] args) {

    TreeSet<String> t1=new TreeSet<>(new comp());
        t1.add("wow");
        t1.add("abnms");
        t1.add("blue");
        t1.add("pink");
        t1.add("red");
        //t1.add(null);
        System.out.println(t1);
        for(Object f1:t1){
        System.out.println(f1);
    }
//        LinkedList<String> l1=new LinkedList<>();
//        l1.add("anoj");
//        l1.add("klls");
//        System.out.println(l1.size());
//        //System.out.println(l1.get(l1.size())); errorfor this partcular because index is 2 where l1 has only 0 and 1
//        l1.add(l1.size(),"abc");
//        for (String f1:l1){
//            System.out.println(f1);
//        }

        System.out.println(t1.first());
        ;
}

}
class comp implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        String s1=(String)o1;
        String s2=(String)o2;
        return -(s1.compareTo(s2));
    }
}

