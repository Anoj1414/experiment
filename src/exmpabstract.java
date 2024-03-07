public class exmpabstract {
    public static void main(String[] args) {
        M1 m2=new test1();
        m2.n();
        System.out.println(m2.b1);
        m2.m1();
        P p1=new test1();

        System.out.println(p1);
        test1 t1=new test1();
        System.out.println(t1.b1);
        //it go no show error because the b1 is present in the two abstract if b1 is not there in the test2 class interface
        p1.p21();
        System.out.println(t1.b1);
        //m m3=new m();
        p1.m1();
        test1 t2=new test1();
        t2.getc();
        t2.n();
        System.out.println("s.s.s");
        t2.getc();
    }


}
abstract  class M1{
    int b1=45;

    int c;
    abstract void n();


    public void m1(){

        System.out.println("we are in the m1");

    }

    public void getc()
    {
        System.out.println(c);
    }
    public  M1()
    {
        System.out.println("wow ");
    }



}
 class test1 extends M1 implements P
{

    //m m2=new test1();
      int b1;

    int a;

    public test1() {

        System.out.println("it is an constructor of the test1");
    }

    @Override
    void n() {
       // super();
        c=10;
    }

    //    public test1(){
//        super();
//    }
    public void m1() {
        System.out.println("in the test1 in m1");
    }
    public void p(){

    }



}
interface P {
    int b1 = 0;
   void p();
   void m1();
   default void p21()
   {

       p23();
   }
   private void p23(){

       System.out.println("we are calling the p23");
   }
}
 class k extends test1{

    public void p21(){
        System.out.println("ssss");
    }

    public void test12(){
            super.b1=25;
    }

}
