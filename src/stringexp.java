public class stringexp {
    public static void main(String[] args) {
        String a="a";
        String b=a+10;
        System.out.println(b);
        //String c=10+10;
        String c=""+10;
        System.out.println();
        System.out.println(b+25);
        String m="Idly* "+10;
        String[] m1=m.split("\\*");
        System.out.println(m1[0].equals("Idly"));
        StringBuilder sb=new StringBuilder("Hello ");
        sb.append("Java");
        String l1=sb.toString();
        System.out.println(l1);
        System.out.println(null+":"+10);
        System.out.println(10+20+""+20);
    }
}
