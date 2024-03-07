import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListInterview {
    public static void main(String[] args) {
        List<Integer> numbers=new ArrayList<>();
        List<Integer> integerList=new ArrayList<>();
        numbers.add(35);
        numbers.add(25);
        numbers.add(2);
        numbers.add(25);
//        for(int i=numbers.size()-1;i>=0;i--){
//            System.out.println(numbers.get(i));
//        }
        boolean flag=true;
        ListIterator<Integer> it=numbers.listIterator();
 //       for (int n1:numbers)
        while(it.hasNext()){
            numbers.add(256);
        }
         for(int i=0;i<numbers.size();i++)
                {
//
                int n1=numbers.get(i);
            while (true){
                if(numbers.contains(n1))
                {
                    numbers.remove((Integer)n1);
                }
                else{

                    break;
                }



            }

            numbers.add(i,n1);



//            if(!integerList.contains(n1))
//                    {
//                       integerList.add(n1);
//                    }


        }


        System.out.println(numbers);

    }
}