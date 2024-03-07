public class Demo2 {
    public static void main(String[] args) {
        Thread t1=  new Thread("name"); //error;
        //thread1 t1=new thread1();
        Thread2 t3= new Thread2();
        Thread2 t2= new Thread2();
        //t3.start();
        t2.start();
    }
}
class Thread2 extends Thread{
    @Override
    public void run() {
        System.out.println("it is a thread"+Thread.currentThread().getName());
    }
}
