import java.util.Arrays;

public class leet6 {
    public static void main(String[] args) {
        String version1 = "1.02.3.0";
        String  version2 ="1.3";
       // String  version2 = "1.000000000000000000000000000000001";
        System.out.println(compareversion(version1,version2));
        String s1="aaabbDdddcCAaRte";
        System.out.println(duplicateRemove(s1));
    }
        public static int compareversion(String a,String b) {
            String[] firstarray = a.split("\\.");
            String[] secondarray = b.split("\\.");
            System.out.println(Arrays.toString(firstarray));
            int maxlength = Math.max(firstarray.length, secondarray.length);
            int first=0;
            int second=0;
            for (int i = 0; i < maxlength; i++) {
                first=i<firstarray.length?Integer.parseInt(firstarray[i]) : 0;
                second=i<secondarray.length?Integer.parseInt(secondarray[i]):0;
                if(first<second){
                    return -1;
                } else if (first>second) {
                    return 1;
                }

            }
            return 0;
        }

        public static String duplicateRemove(String s1){
        StringBuilder resStringBuilder=new StringBuilder();
        for(int i=0;i<s1.length();i++){
            String s = String.valueOf(s1.charAt(i)).toLowerCase();
            if(resStringBuilder.length()==0){
                resStringBuilder.append(s);
                continue;
            }
                if(!(String.valueOf(resStringBuilder.charAt(resStringBuilder.length()-1)).equals(s))){
                    resStringBuilder.append(s);
                }
        }

           return resStringBuilder.toString();

        }





}
