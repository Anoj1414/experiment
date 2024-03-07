package abc;
public class threadcheck2 {
    public static void main(String[] args) {
        thread1 th=new thread1();
    Thread t1=new Thread(th);
        Thread t2=new Thread(new thread2());
    t1.start();
        //System.out.println("wow");
        //Thread t2=new Thread(new thread2());
//        try{
//            t1.join();
//        }
//        catch (InterruptedException e){
//            System.out.println(e);
//        }
        t2.start();


    }
}
class thread1 implements Runnable{
    int i=0;
    @Override
    public void run() {
        while (i<5){
            try{
            System.out.println("it is a thread1");
            i++;
            Thread.sleep(3000);
                System.out.println("after sleep thread1");
        }
            catch (InterruptedException e){
                System.out.println(e);
            }
    }
}}
class thread2 implements Runnable{
    int i=0;
    @Override
    public void run() {

    try {
        while (i<5){
            System.out.println("it is a thread2");
            i++;
            Thread.sleep(2000);
            System.out.println("after sleep thread2");
    }
    }
    catch (InterruptedException e){
        System.out.println(e);

    }}
}

