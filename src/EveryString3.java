import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EveryString3 {
    public static void main(String[] args) {
        System.out.println(removeduplicates("aaabbDdddcCAaRte"));
        Pattern pattern = Pattern.compile("[abc]{3}");
        System.out.println(Pattern.matches("[abc]{3}","abc"));
        Matcher matcher = pattern.matcher("acbedbcbcabcedbca");
        boolean found = false;
        while (matcher.find()) {
            System.out.println("I found the text "+matcher.group()+" starting at index "+
                    matcher.start()+" and ending at index "+matcher.end());
            found = true;
        }
        if(!found){
            System.out.println("No match found.");
        }


        System.out.println(countcharacter("acbedbcbcabcedbca"));
        System.out.println(anagram("abc","cab"));

    }
    public static String removeduplicates(String s1)
    {
        StringBuilder result=new StringBuilder();
        String previous="";
        String value="";
        int count=0;
        for(int i=0;i < s1.length();i++){
            value=String.valueOf(s1.charAt(i));
            if(i==0){
                previous=value;
                count=count+1;
                result.append(value);
                //result.append(count);
                continue;
            }
            if(previous.equalsIgnoreCase(value)){
                count=count+1;
                continue;
            }
                previous=value;
                count=0;
                result.append(value);
               // result.append(count);


        }

        return result.toString();
    }


    public static String countcharacter(String s){
        List<Integer> l1=new ArrayList<>();
        String substring="";
        for(int i=0;i<s.length();i++){
//            if(i+3>=s.length()){
//                break;
//            }
//            else{
                substring=s.substring(i,i+3>s.length() ?  s.length() : i+3);
                if(anagram("abc",substring))
                {
                    l1.add(i);
                    // i=i+3;
                }
//            }
        }
        System.out.println(l1);
        return null;
    }


    public static boolean anagram(String a,String b){
        if(a.length()==b.length()){
            char firstarray[]=a.toCharArray();
            char secondarray[]=b.toCharArray();
            Arrays.sort(firstarray);
            Arrays.sort(secondarray);
            return Arrays.equals(firstarray, secondarray);
        }
        return false;
    }







}
