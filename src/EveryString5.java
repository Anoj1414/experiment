import java.util.ArrayList;
import java.util.List;

public class EveryString5 {
    public static void main(String[] args) {
        System.out.println(substrings("welcomeTo"));
    }

    public static List<String> substrings(String s1){
        List<String> stringList=new ArrayList<>();
        int m=0;
        for(int i=0;i<s1.length();i++){
            m=i+1;
            while (true){
                if(m>s1.length()){
                    break;
                }
                stringList.add(s1.substring(i,m));
                m=m+1;
            }

        }
        return stringList;
    }
}

