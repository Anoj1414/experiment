public class nestedinterface {

}
interface Showable{
    void show();
    int a=20;
    interface Message{
        void msg();
        int b=25;
    }
}
class TestNestedInterface1 implements Showable.Message{
    int b=30;
    public void msg(){
        System.out.println("Hello nested interface");
    }

    public static void main(String args[]){
        Showable.Message message=new TestNestedInterface1();//upcasting here
        message.msg();
        System.out.println(message.b);
        TestNestedInterface2 t2=new TestNestedInterface2();
        t2.msg();
        checking c1=new checking();
        c1.s1();
    }



}
class A1{
    interface Message{
        void msg();
    }
}

class TestNestedInterface2 implements A1.Message{
    public void msg(){
        System.out.println("Hello nested interface");
    }

    }

interface M{
    class A2{
        int k=69;

    }
}
class checking implements M{
    M.A2 l1=new M.A2();
    public void s1(){
        System.out.println(l1.k);

    }
}



