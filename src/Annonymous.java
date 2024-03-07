public class Annonymous {


}


 class Person{
     void eat(){

     }
     int a=10;
}
//abstract class Person{
//    abstract void eat();

    //here the same way were we can use the abstract class person or the interface
//}

interface f1{
    void in();
}




class TestAnonymousInner{
    public static void main(String args[]){
        Person p=new Person(){
            void eat(){

                System.out.println("nice fruits");
            }
            void check(){

                System.out.println("nice fruits you must eat");
            }
            int a=25;
            int b=26;
        };
        p.eat();
        System.out.println(p.a);
        //System.out.println(p.b) it will gone show the error;
        f1 f=new f1(){

            @Override
            public void in() {

                System.out.println("we aare in the interface class");
            }
        };
        f.in();

    }
}
