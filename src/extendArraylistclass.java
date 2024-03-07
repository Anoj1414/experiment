import java.util.*;

public class extendArraylistclass extends ArrayList<Integer> {
    public static void main(String[] args) {
        TreeMap<Object,Integer> h1=new TreeMap<>();
        h1.put("ss",2);
        h1.put("sss",3);
        h1.put("lays",5);

        List<Integer> l1=new ArrayList<>();
        //l1.addAll();
        l1.removeAll(new ArrayList<>(Collections.singleton(1)));
        //Collections.singleton(2);
        l1.addAll(Collections.singletonList(1));
        System.out.println(h1);
        System.out.println(l1);
    }
}
