public class sortedarray implements Cloneable {
    public static void main(String[] args) {
        System.out.println("called");
        int a[]=new int[10];
        int b[]=new int[]{2,1,3,4,9,8};
        int c[]={1,2,3};
       // c[3]=2;
        System.out.println(c[0]);
        //b[6]=25 ;//when you run it will show the excetion;
        System.out.println(b[0]);
        boolean flag=true;
        while(flag){
            flag=false;
            for(int i=0;i<b.length-1;i++){
                System.out.println(b[i]);
                System.out.println(b[i+1]);
                    if(b[i]>b[i+1]){
                        //System.out.println("kk");
                        int j=b[i];
                        b[i]=b[i+1];
                        b[i+1]=j;
                        flag=true;
                    }
            }
        }
        System.out.println("result= ");
        for(int i=0;i<b.length;i++) {
            System.out.println(b[i]);
        }
        System.out.println(b.toString());
            //();
        //this.clone();
            s1();

    }

    @Override
    public sortedarray clone() {
        try {

            return (sortedarray)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }

    }
public static void s1(){
    System.out.println("sssss");
    check();
}
    public static  void check(){
        //main(new String[]{"a","s"});
        System.out.println("check");

    }
}
