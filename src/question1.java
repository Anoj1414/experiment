import java.util.*;
import java.util.stream.Collectors;

public class question1 {
    public static void main(String[] args) {
        Map<String,Integer> h1=new HashMap<>();
        String s1="Java Is good and Java IS Nice";
        String s2="aabbbccaa";
        List<String> words=new ArrayList<>(Arrays.asList(s2.split("")));
        System.out.println(words);
        List<String> words2=new ArrayList<>(Arrays.asList(s1.split(" ")));
        words.forEach(n->{
            h1.put(n.toLowerCase(),h1.getOrDefault(n.toLowerCase(),0)+1);
        });
        System.out.println(h1);
        h1.entrySet().stream().forEach(n->{
            if(n.getValue()==1){
                System.out.println(n.getKey());
            }
        });
        int len=words.size();
        words=words.stream().map(n->n.toLowerCase()).collect(Collectors.toList());
        // String result="";
        for(int i=0;i< words.size();i++){
          String result=words.get(i);
           words.remove(result);
           if(words.contains(result))
           {
             //  String finalResult = result;
               words.removeIf(n->n.equalsIgnoreCase(result));
               words.add(i,result);
           }
           else{
               words.add(i,result);
           }
        }

        System.out.println(words);


//        for(int i=0;i<words.size();i++){
//
//        }





    }
}
