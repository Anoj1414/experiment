import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EveryString4 {
    public static void main(String[] args) {
        List<String> words=new ArrayList<>(Arrays.asList("eat","tea","tan","ate","nat","bat","tab"));
        innerInsertion(words);
    }
    public static void innerInsertion(List<String> words){
        List<List<String>> anagramlist=new ArrayList<>();
        // List<String> inner=new ArrayList<>();
      //  boolean complete=false;
//        while(!complete){
//            for(int i=0;)
//        }
        String s="";
        for(int i= words.size()-1;i>=0;i--){
            List<String> inner=new ArrayList<>();
            if(words.size()==0){
                break;
            }
            i=words.size()-1;
            s=words.get(i);
            inner.add(s);
            words.remove(s);
            String finalS = s;
            words.removeIf(n->{
                if(anagram(n, finalS)){
                    inner.add(n);
                    return true;
                }
                else{
                    return false;
                }
            });

            anagramlist.add(inner);
            //inner.clear();
        }

        System.out.println(anagramlist);
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
