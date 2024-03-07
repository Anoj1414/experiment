public class exmpinhe {
    public static void main(String[] args) {
        phone obj=new smartphone();
        obj.b1();
        System.out.println(obj.b1);
        obj.button();

        phone p2=new smartphone();
        smartphone p21 = (smartphone)p2;
        System.out.println(p2.b1);
        System.out.println(p21.b1);
        System.out.println("see");
        p21.button();
        //p21.a1();
        //p2.a1(); error

        //obj.c(); //error
        System.out.println("concept");
        Animal123 animal123=new Dog12();
        Animal123 animal1231=new BabyDog1();
        //see once babydog12 java file
        animal1231.eat();
        animal123.eat();

        System.out.println("concept closed");
        System.out.println(p2 instanceof smartphone);
        System.out.println(p2 instanceof phone);
        System.out.println(p21 instanceof smartphone);
        phone phone1=new phone();
        smartphone smartphone1=new smartphone();

        System.out.println(phone1 instanceof smartphone);
        System.out.println(smartphone1 instanceof smartphone);
        System.out.println(smartphone1 instanceof phone);
        smartphone smartphone2= (smartphone) p2;
        //phone phone1=new Animal12() ;//error;
        //phone phone=new smartphone("al","ls");



    }
}
class phone {
    int b1=45;

    int c;

    public phone() {

        System.out.println("wow ");
    }
    public void b1(){

        System.out.println("it is a phone1");
    }

    public phone(int a){

        System.out.println(a+"sss");
    }

    public void button(){
        System.out.println("it is a button in the phone 1");
    }

    private phone(String i,String b){

    }
}
class smartphone extends phone{
    int b1=50;
    public smartphone() {
        super(10);
        System.out.println("wow 1234");
    }
    public void b1(){

        System.out.println("it is a smartphone1");
    }
    public void a1(){

        System.out.println("it is  a a1");
    }
    public void c(){
        System.out.println("it is a c");
    }

    private smartphone(String i,String b){

    }

}

class Animal123{
    void eat(){System.out.println("animal is eating...");}
}
class Dog12 extends Animal123{
    void eat(){
        System.out.println("dog is eating...");}
}
class BabyDog1 extends Dog12 {
         void eat(){
             System.out.println("babydog1 is eating....");
         }
         //comment and uncomment this eat() to see the magic
}
