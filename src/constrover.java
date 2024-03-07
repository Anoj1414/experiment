public class constrover {
    public static void main(String[] args) {
           // ABC a1=new ABC();
            Def d1=new Def();

        System.out.println(ABC.m);

    }

//we can not  overide the constructor can call the previous constructor by the super keyword

}
class ABC{
    static int m=25;
    int c1=25;
    public  ABC(){

       // this(25);
        m=20;
        System.out.println("overriding...");

    }
    public ABC(int a){

    }
    public  ABC m(){
        System.out.println("i am m method in the ABc");
        return this;
    }

    public static void n1(){

        System.out.println("static method of ABC");
    }

}
class Def extends ABC{
//    public ABC(){
//        System.out.println("wow");
//    }


    public Def(int a){
        System.out.println(a+" is called by the this");
    }

    public Def() {
        this(5);
        //super();
        System.out.println("we are in the def constructor");
        ABC.n1();
    }

    @Override
    public Def m() {
        System.out.println("i am m method in the Def class");
        return this;
    }

}
