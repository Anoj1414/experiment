import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class Example2 {

    public static void main(String[] args) {
        HashMap<student,Integer> l1=new HashMap<>();
        HashMap<Integer,student> l2=new HashMap<>();

        student student1=new student(1,"abc");
        student student2=new student(2,"xyz");
        student student3=new student(1,"abc");
        System.out.println(student1.hashCode());
        System.out.println(student3.hashCode());
        System.out.println(l1.put(student1,1));
        l2.put(1,student1);
        l2.put(2,student2);
        l1.put(student2,2);
        System.out.println(l1.put(student3,3));
        System.out.println(l1);
        l1.put(student3,l1.getOrDefault(student3,4));

        System.out.println(l1);

        for(Integer i:l1.values())
        {
            System.out.println(i);
        }
        List maplist=new ArrayList<>(l1.entrySet());
        List maplist1=new ArrayList<>(l1.values());
        System.out.println(maplist1.subList(1,2));

        System.out.println("maplist "+maplist);
        Collections.sort(maplist,new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
               return  ((Comparable) ((Map.Entry) (o1)).getValue()).compareTo(((Map.Entry) (o2)).getValue());
            }
        });
        System.out.println(maplist);

        Set<Integer> s1=new HashSet<>();


        System.out.println("we are checking the stream for this");
        l1.entrySet().stream().filter(n->n.getKey()==student1).forEach(n-> System.out.println(n.getKey()));
//        s1.stream().sorted(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return 0;
//            }
//        });

       // l1.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(n-> System.out.println(n.getKey()));

        l1.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(n-> System.out.println(n.getKey()));


        TreeMap<student,Integer> treeMap=new TreeMap<>(l1);
        System.out.println("Tree map it is"+ treeMap);
//        treeMap.put(student1,null);
//        System.out.println("treemap "+treeMap);
        //treeMap.put(treeMap.getOrDefault())

      // treeMap.put(null,23);
       // treeMap.put(student1,null);




        System.out.println("TreeMap "+treeMap.ceilingEntry(student1));

        System.out.println("getting value here"+treeMap.ceilingEntry(student1).getValue());
        System.out.println("tree map "+ treeMap.ceilingKey(student2));
        HashMap<List<student>,Integer> studentIntegerHashMap=new HashMap<>();
        System.out.println();

        student s5=new student(1,"sls");
        student s6=s5.getclone();
        System.out.println(s6.c);
        s6.c=25;
        System.out.println(s6.c);
        student s7=s5.getclone();
        System.out.println(s7.c);

//        l1.entrySet().stream().forEach(n->l1.put(n.getKey(),n.getValue()*25));
        System.out.println(l1);


        ConcurrentHashMap<Integer, String> chm
                = new ConcurrentHashMap<Integer, String>();

        //chm.put(null,null);


        Iterator<Map.Entry<student,Integer>> mapiterator=l1.entrySet().iterator();
//        for(mapiterator.hasNext()){
//
//        }
//        l1.entrySet().removeIf(n->{
//            return n.getKey().equals(student2);
//        });
        for(student student67:l1.keySet()){
            l1.put(student67,l1.get(student67)*25);
           // l1.remove(student67); // error concurrent modification exception
        }
        System.out.println("list2 "+l1);
        l1.entrySet().stream().forEach(n-> {
            l1.put(n.getKey(), l1.get(n.getKey()) * 25);
           // l1.put(student1,100); it will work fine
            //l1.remove(n.getKey()); error concurrent modification exception
        });
        System.out.println("list"+l1);
        l1.forEach((k,v)->{
 //           l1.remove(k); error concurrent modification exception
            l1.put(k,25);

        });

        List<Map.Entry<student,Integer>> entryList=new ArrayList<>(l1.entrySet());
        Collections.sort(entryList, (o1, o2) -> {
           return  o1.getValue().compareTo(o2.getValue());
        }
        );
        System.out.println(entryList);
        entryList.stream().sorted(new Comparator<Map.Entry<student, Integer>>() {
            @Override
            public int compare(Map.Entry<student, Integer> o1, Map.Entry<student, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        }).collect(Collectors.toList());


//        l1.put(null,null);

        HashMap<student,Integer> hashMap=new HashMap<>();
        if(l2.entrySet().stream().filter(n -> n.getValue().getName().equals("abc")).toList().size()>0)
        {
            System.out.println("working fine...");
        }
        System.out.println(l2.get(new student(2564,"sllls")));

//        l2.entrySet().stream().forEach(n->{
//            if(n.getValue().getName().equals("abc")){
//            }
//        });







    }
}
class student implements Comparable<student>{
    int id;
    String name;

    int c;

    public student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        student student = (student) o;
        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
//
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public student getclone(){
           student s=new student(105,"sowmya");
           s.c=30;
           return s;
    }

    @Override
    public int compareTo(student o) {

        return -((this.getName()).compareTo(o.getName()));
    }
}
class studentcompare implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        student s8=(student) o1;
        student s9=(student)o2;
        return -((s8.getName()).compareTo(s9.getName()));

    }
}
