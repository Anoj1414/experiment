public class stringexmp2 {
    public static void main(String[] args) {
        String a = "this is javatpoint";
        String b[] = a.split("\\s");
        //System.out.println(reverse(a));
        String s2="";
        for(int i=0;i<b.length;i++){
            s2=reverse(b[i]);
            b[i]=s2;
        }
        s2="";
        for(int i=0;i<b.length;i++){
            s2=s2+b[i]+" ";
        }
        System.out.println(a.length());
        System.out.println(s2.trim().length());
        System.out.println(s2);
        String str = "This is last index of example";
        int index = str.lastIndexOf("of", 25);
        System.out.println(index);
        index = str.lastIndexOf("of", 10);
        //it will see the 0 to 10;
        System.out.println(index); // -1, if not found


        String s1="My name is Khan. My name is Bob. My name is Sonoo.";
        String replaceString=s1.replaceAll("\\s","");
        System.out.println(replaceString);
        String rep=s1.replaceAll(""," ");
        System.out.println(rep);
        String e1=new String("name");
        String e2=new String("name");
        System.out.println(e1==e2);
        System.out.println(e1.endsWith(""));



    }

    public static String reverse(String m){
        String s3="";
        for(int i=m.length()-1;i>=0;i--)
        {
            s3=s3+m.charAt(i);
        }
        return s3;
    }




}