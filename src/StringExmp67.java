public class StringExmp67 {
    public static void main(String[] args) {

        String s="welcometojava";
        String smallest = s.substring(0,3);
        String largest = s.substring(0,3);

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for(int i=0;i<s.length()-3;i++){
            String s1=s.substring(i,i+3);
            if(s1.compareTo(smallest)<0)
            {
                smallest=s1;

            }
            if(s1.compareTo(largest)>0)
            {
                largest=s1;
            }


        }


        System.out.println("skks "+smallest);
        System.out.println("slls "+largest);
    }
}
