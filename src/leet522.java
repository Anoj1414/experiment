import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leet522 {
    public static void main(String[] args) {
        String source="acbedbcbcabcedbca";
        String pattern="abc";
        String substring;
        List<Integer> result=new ArrayList<>();
        System.out.println("Substring starting from index 0 to 6: "+source.substring(0,1));

        System.out.println(indexes(source,pattern));
    }
    public static boolean anagramornot(String a,String pattern){
        char[] firstArray = a.toCharArray();
        char[] secondArray =pattern.toCharArray();
        Arrays.sort(firstArray);
        Arrays.sort(secondArray);
        return Arrays.equals(firstArray,secondArray);
    }

    public static List<Integer> indexes(String source,String pattern){
        List<Integer> result=new ArrayList<>();
        String substring;
        for(int i=0;i<source.length();i++){
            if(i+pattern.length()>source.length()){
                continue;
            }
            substring=source.substring(i,i+pattern.length());
            if(anagramornot(substring,pattern)){
                result.add(i);
            }
        }
        return result;
    }

}
