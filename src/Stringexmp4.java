public class Stringexmp4 {
    public static void main(String[] args) {
        String a="a";
        if(String.valueOf(a.charAt(0)).equals("a"))
        {
            System.out.println("klmns");
        }
        System.out.println(String.valueOf(a.charAt(0))=="a");

    String m1="this is activa125";
    String b[]=m1.split("\\s");
    String s3="";
    for(int i=0;i<b.length;i++) {
        for(int j=0;j<b[i].length();j++)
        {
            if(j==0){
                String s4=(String.valueOf(b[i].charAt(j))).toUpperCase();
                s3=s3+s4;
            }
            else{
                    s3=s3+String.valueOf(b[i].charAt(j));

            }
        }

        s3=s3+" ";
    }


      //  System.out.println(s3.compareTo(null)) ; null pointer exception

        System.out.println(s3);
      //  System.out.println(s3.replace("s",null));
        //s3.replaceAll("",null);
        //s3.indexOf()
}
}
