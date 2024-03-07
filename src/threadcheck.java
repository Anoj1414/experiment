public class threadcheck {
    public static void main(String[] args) {
        mythread1 t1=new mythread1("anoj");
        mythread1 t2=new mythread1();
//        t1.start();
//       // mythread1 t2=new mythread1();
//        t2.start();
        Thread t3=new mythread1("ss");
        t3.start();
        //t2.start(); error you can't start the two threads
    }

}
class mythread1 extends Thread{
    public mythread1(String name){

        super(name);
    }
    public mythread1(){

    }

    @Override
    public  void run() {
        System.out.println(Thread.currentThread().getName());

    }

}
