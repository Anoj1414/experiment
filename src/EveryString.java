import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EveryString {
    public static void main(String[] args) {
        String s1="this is javatpoint";
        StringBuilder stringBuilder=new StringBuilder();
        for(int i=s1.length()-1;i>=0;i--){
            stringBuilder.append(s1.charAt(i));
        }
        System.out.println(stringBuilder.toString());
        stringBuilder.delete(0,stringBuilder.length());
        System.out.println(stringBuilder);
        List<String> stringList= new ArrayList<>(Arrays.asList(s1.split(" ")));
        String a[]=s1.split(" ");
        for(int i=0;i<stringList.size();i++){
            String s2=reverse(stringList.get(i));
            stringList.set(i,s2);
        }
        System.out.println(stringList);

        System.out.println("cba".equals(reverse("abc")));

    }

    public  static String reverse(String s){
        StringBuilder s2= new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
           s2.append(s.charAt(i));
        }
        return s2.toString();
    }
}
