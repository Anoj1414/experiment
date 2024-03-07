import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class blockedq {
    public static void main(String[] args) {
        BlockingQueue<Integer> l1=new ArrayBlockingQueue<>(5);
       Thread t1 = new Thread( new insert(l1));
       t1.start();
        Thread t2 = new Thread( new remove(l1));
        t2.start();
    }
}
class insert implements Runnable{
    int i=0;
    BlockingQueue q;
    public insert(BlockingQueue q){
        this.q=q;

    }
    @Override
    public void run() {
        while (true){
            try{
                System.out.println("the element was add"+i);
                q.put(i++);
                Thread.sleep(2000);
            }
            catch (InterruptedException e){
                System.out.println(e);
            }
        }

    }
}


class remove implements Runnable{
    //int i=0;
    BlockingQueue q;
    public remove(BlockingQueue q){
        this.q=q;

    }
    @Override
    public void run() {
        while (true){
            try{
                int i= (int) q.take();
                System.out.println("the element was removed"+i);
                //q.put(i++);
                Thread.sleep(3000);
            }
            catch (InterruptedException e){
                System.out.println(e);
            }
        }

    }
}
