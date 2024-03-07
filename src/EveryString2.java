import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EveryString2 {
    public static void main(String[] args) {
        String s1="this is javatpoint";
        List<String> list=new ArrayList<>(Arrays.asList(s1.split(" ")));
        for(int i=0;i<list.size();i++){
           list.set(i,Increase(list.get(i)));
        }
        System.out.println(list);
        String s3="keep";
        String s4="peek";
        String s5="aaccaa";
        System.out.println(returncount(s5));

    }
    public static String Increase(String s){
        StringBuilder stringBuilder=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(i==0){
                stringBuilder.append(String.valueOf(s.charAt(i)).toUpperCase());
               if(Character.isUpperCase(s.charAt(i))) {

               }
                continue;
            }
            stringBuilder.append(s.charAt(i));
        }
        return stringBuilder.toString();
    }

    public static String anagramornot(String s1,String s2){
        s1=s1.toLowerCase().trim();
        s2=s2.toLowerCase().trim();
        char a[]=s1.toCharArray();
        return null;
    }

    public static String returncount(String s1){
        int count=1;
        String previous="";
        String original="";
        for(int i=0;i<s1.length();i++){
           if(i==0){
               previous=String.valueOf(s1.charAt(i));
               continue;
           }
           if(previous.equals(String.valueOf(s1.charAt(i))))
           {
               count=count+1;
               continue;
           }
           else{
               original=original+previous+count;
               previous=String.valueOf(s1.charAt(i));
               count=1;
           }

        }


        original=original+previous+count;
        return original;
    }


}
