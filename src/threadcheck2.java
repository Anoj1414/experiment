public class threadcheck2 {
    public static void main(String[] args) {
        thread1 th = new thread1();
        Thread t1 = new Thread(th);
        //t1.start();
        //System.out.println("wow");

        //Thread t2=new Thread() it will work correct but run method has no statement to execute it;
        //t2.start();
        Runnable r1=new thread1();

        Thread t4 = new Thread(r1,"thread3");
        Thread t8 = new Thread(r1,"thread56");
        thread1 t5 = new thread1();
        //Thread t2=new thread56();
        //Thread t3=new thread56();
        thread56 t3 = new thread56();
        thread56 t2 = new thread56();
        //r1 = new thread1();
        //     r1.start() ; it will show the error
        Thread t6 = new Thread(t1, "thread5");

        Thread t9 = new Thread(t2,"thread3");
        Thread t10 = new Thread(t3,"thread56");
//        t6.start();
//        t8.start();
//        t4.start();

//        t3.start();
//        t2.start();

        t9.start();
        t10.start();
        //t5.start(); IT IS An error

        //t6.start();


    }
}
class thread1 implements Runnable{
    int i=0;
    int j=0;
    @Override
    public  synchronized void run() {
        while (i<5){
        System.out.println("it is a thread "+Thread.currentThread().getName());
        i++;
        j=23;
        }
        System.out.println(Thread.currentThread().getName()+" "+j+Thread.currentThread().getName());
    }
}
class thread56 extends Thread{
    int i=0;
    @Override
    public  void run() {

            n1(0);

}

        public static   synchronized   void n1(int i){

            while (i<5){
                System.out.println("it is a threadz " + Thread.currentThread().getName());
                i++;
            }
        }
}
