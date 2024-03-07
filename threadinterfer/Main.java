package threadinterfer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> l1=new ArrayList<String>();
        myproducer mp=new myproducer(l1);
        Thread t1=new Thread(mp);
                t1.start();
//                try {
//                    t1.join();
//here we are using the join to function to execute properly
//                }
//                catch (InterruptedException e){
//                    System.out.println(e);
//                }
       // System.out.println("it is "+Thread.currentThread().getName());
//        mp.show();
        myconsumer mc=new myconsumer(l1,1);
        myconsumer mc1=new myconsumer(l1,2);
        new Thread(mc).start();
        //myconsumer mc1=new myconsumer(l1,2);
        //new Thread(mc1).start();

    }
}
class myproducer implements Runnable{
    List<String> buffer;

    public myproducer(List<String> buffer) {
        this.buffer = buffer;
    }
//    public void synchronized show1(){
//
//    }

    @Override
      public void run() {
        for(int i=0;i<=5;i++){
            try {
                System.out.println("it is wo");
                synchronized (buffer)
                {
                    buffer.add("abc" +i);
                }
                //buffer.add("abc"+i);
                Thread.sleep(1000);
            }
            catch (Exception e){
                System.out.println(e);
            }

        }
        //buffer.add("eof");
        synchronized (buffer){
            buffer.add("eof");
        }
    }
    public void show(){
//        for(String m:buffer){
//            System.out.println(m);
//        }
        System.out.println("show method is executed ");
    }

}
class myconsumer implements Runnable{

    List<String> buffer;
    public int i;

    public myconsumer(List<String> buffer,int i) {
        this.buffer = buffer;
        this.i=i;
    }

    @Override
     public void run() {
        while(true){
            synchronized (buffer)
            {
            if(buffer.isEmpty()){
                continue;
            }
            if(buffer.get(0).equals("eof")){
                System.out.println("exiting");
                break;
            }
            else{
                System.out.println("remove"+" "+i+""+buffer.remove(0));;
            }
        }}


    }
}