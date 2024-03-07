public class localInner1{
    private int data=30;
    public int data1=29;
    static int data3=69;


      //instance variable
    void display(){
        int data4=56;
        class Local{
           public void msg(){
                System.out.println(data);
               System.out.println(data4);
           }
        }
        Local l=new Local();
        System.out.println(this.new inerr().m);
        l.msg();
    }
    class inerr{
        int m=52;

        int data1=78956;
        public void checking(){
            System.out.println("we are doing");
            //System.out.println(localInner1.this.data1) to particular need the data member of the outerclass you can use this;


            System.out.println(localInner1.this.data1);
            System.out.println(this.data1);
            System.out.println("----------");
            System.out.println("checking 1111 "+this.getM());

        }

        public int getM() {
            return m;
        }
    }

    public void test(){
        localInner1.inerr l23=this.new inerr();
        System.out.println(l23.m);
        l23.checking();
    }
    static class Innerstatic{
        void msg(){System.out.println("data is "+data3);}
    }






    public static void main(String args[]){
//        localInner1 obj=new localInner1();
//        obj.display();
//        obj.test();
//
//
//
        localInner1 obj1=new localInner1();
//        obj1.display();
//        obj1.data1=25;
     //  obj1.test();
//        localInner1.Innerstatic ins1=new localInner1.Innerstatic();
//        ins1.msg();
        localInner1.inerr li=obj1.new inerr();
        System.out.println("second time");
        li.checking();

    }
}