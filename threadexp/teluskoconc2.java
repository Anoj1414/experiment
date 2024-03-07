package threadexp;
import java.util.AbstractList;

class A{
    int num;
    boolean valueset=false;
    public synchronized void  getNum(){
      while (!valueset)
      {
            try {
                wait();
            }
            catch (Exception e){
                System.out.println("error12");
            }
        }
        System.out.println("get value"+Thread.currentThread().getName() +"  "+num);
        valueset=false;
        notifyAll();
    }

    public synchronized void setNum(int num) {
        while(valueset){
            try {
                wait();
            }
            catch (Exception e){
                System.out.println("error12");
            }
        }
        System.out.println("put value"+Thread.currentThread().getName()+"  "+num);
        this.num = num;
        valueset=true;
        notifyAll();
    }
}
class producer implements Runnable{
    A a;
    public producer(A a){
        this.a=a;
        Thread t1=new Thread(this,"thread1");
        t1.start();
    }
    public void run(){
        int i=0;
        while(true){
            try{
                this.a.setNum(i);
                i++;
                Thread.sleep(1000);
            }
            catch (Exception e){
                System.out.println("error1");
            }
        }
    }}
class consumer implements Runnable{
    A a;

    public consumer(A a1) {
        this.a=a1;
        Thread t2=new Thread(this,"consumer");
        t2.start();
    }


    @Override
    public void run() {
        while(true){
            a.getNum();
            try{
                Thread.sleep(3000);
            }
            catch (Exception e){
                System.out.println("error22");
            }

        }

    }

}


public class teluskoconc2 {
    public static void main(String[] args) {
        A a1=new A();
        producer p1=new producer(a1);
        consumer c2=new consumer(a1);
    }
}