class Demo extends Thread{
    public void run(){
        for (int i=0; i<3 ; i++)
            Thread.yield();
            System.out.println("In control of " + Thread.currentThread().getName() + " thread");
    }
}
public class Demo_one{
    public static void main(String[]args){
        Demo my_obj = new Demo();
        my_obj.start();
        for (int i=0; i<3; i++){
            //Thread.yield();
            System.out.println("In control of " + Thread.currentThread().getName() + " thread");
        }
    }
}