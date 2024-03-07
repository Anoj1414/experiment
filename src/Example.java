import java.io.FileNotFoundException;
import java.util.*;

public class Example {

    public static void main(String[] args) {
        //int a=10/0;

        //System.out.println(divide(10,0));


        //FileNotFoundException
        Employee e1=new Employee(1,"abc");
        Employee e2=new Employee(2,"xyz");
        Employee e3=new Employee(1,"abc");
        HashSet<Employee> h1=new HashSet<>();
        System.out.println(h1.add(e1));
        h1.add(e2);
        h1.add(new Employee(1,"abc"));
        h1.add(null);
        //System.out.println(h1);
        System.out.println(e1.hashCode());
        System.out.println(e3.hashCode());
        System.out.println(e1.equals(e3));
        for(Employee e : h1){
            System.out.println(e);
        }
        h1.add(null);

        List<Integer> l1=new ArrayList<>();
        l1.add(1);
       l1.add(2);
        int a=l1.size()==0?0:l1.get(l1.size()-1);
        System.out.println(a);
//        List<String> l2=Collections.singletonList("0");
//        l2.add("22");
//        System.out.println(l2);
        System.out.println(new ArrayList<String>().add("s"));
        //add null in the list of it is going to show the null pointer expection
        //list .of create an unmodifiable list means unmutable list
        List<Integer> l4=List.of(1,2,3);
       // l4.add(9);





    }
    public static int divide(int a,int b) throws ArithmeticException{
        return a/b;
    }
}
class Employee{
    long id;
    String name;

    public long getId() {
        return id;
    }

    public Employee(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
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
}
