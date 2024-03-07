public class stringanagram {
    public static void main(String[] args) {
        String s1="abcd";
        String s2="dcbaa";
        int k=0;
        if(s1.length()==s2.length()){
            for(int i=0;i<s1.length();i++){
                int m=count(s1,s1.charAt(i));
                int n=count(s2,s1.charAt(i));
                //System.out.println(m+" "+n);
                if(m==n){
                    continue;
                }
                else{
                    k=8;
                }
            }
            if(k==0){
                System.out.println("it is a anagram");
            }
            else{
                System.out.println("it is not a anagram");
            }

        }
        else{
            System.out.println("sorry not anagram");
        }
        System.out.println(count(s1,'a'));
    }
    public static int count(String s,char a){
        int count = 0;
        int startFrom = 0;
        while(true)
        {

            int index = s.indexOf(a,startFrom);

            if(index >= 0)
            {
                count = count + 1;

// start looking after the searched index
                startFrom = index + 1;
            }

            else
            {
// the value of index is - 1 here. Therefore, terminate the loop
                break;
            }


        }
        return count;
}}












