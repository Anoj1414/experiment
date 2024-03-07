import java.util.*;

public class linkedexmp  {
    public static void main(String[] args){
        List<String> al=new ArrayList<>();
        al.add("abc");
        al.add("def");
        al.add("def");
        ListIterator<String> i=al.listIterator();
        System.out.println(i.next());
      // al.add("klm"); // error because it is not synchronized;
        System.out.println(i.hasPrevious());
      //  System.out.println(i.previous());
       // System.out.println(al.remove("klm"));
        //System.out.println(i.hasPrevious());
        System.out.println(i.nextIndex());
        System.out.println(i.next());
        System.out.println(i.nextIndex());
        System.out.println(i.next());
        System.out.println(i.nextIndex());
        System.out.println(i.next());
        System.out.println(i.next());
        System.out.println(al);
        LinkedHashSet<String> linkedHashSet1=new LinkedHashSet<>(al);
        System.out.println(linkedHashSet1);
//        while(i.hasNext()){
//            al.remove("ss");
//        }


    }
}
