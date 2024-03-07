import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Leet5Problem {
    public static void main(String[] args) {
        System.out.println(longestPalidromeSubstring("cbbd"));
    }

    public static String longestPalidromeSubstring(String s){
        List<String> l1=new ArrayList<>();
        String inner="";
        int number=1;
        String largest="";
        for(int i=0;i<s.length();i++){
            while (i + number <= s.length()) {
                inner = s.substring(i, i + number);
                number++;
                if (inner.equalsIgnoreCase(new StringBuilder(inner).reverse().toString())) {
                    if (largest.length() < inner.length()) {
                        largest = inner;
                    }
                }
            }
            number=1;
        }
       // System.out.println(l1);
//        l1.removeIf(n->!palindrome(n));
//       // System.out.println(l1);
//        l1.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return Integer.compare(o1.length(), o2.length());
//            }
//        });
//        System.out.println(l1);
//         System.out.println(l1.get(l1.size()-1));
//        if(l1.size()>0)
//        {
//            return l1.get(l1.size()-1);
//        }
//        return s;
        //System.out.println(l1);
        return largest;
    }


    public static boolean palindrome(String s){
        StringBuilder reverse= new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            reverse.append(s.charAt(i));
        }
        System.out.println(s+" "+reverse.toString());
        return s.equalsIgnoreCase(reverse.toString());
    }
}

