public class InterThreadCommunications {
    public static void main(String[] args) {
        Bank b1=new Bank();
        Thread t1=new Thread(){
            @Override
            public void run() {
                b1.deposit(1000);
            }
        };


        Thread t2=new Thread(){
            @Override
            public void run() {

                b1.withdraw(16000);
            }
        };
        Thread t3=new Thread(){
            @Override
            public void run(){
                b1.checking();
            }
        };
        t2.start();
        //t1.start();
        t3.start();
        t1.start();

    }
}
class Bank{
    int amount=10000;
    synchronized void deposit(int amount){
        System.out.println("going to deposit...");
        this.amount+=amount;
        System.out.println("deposit completed... ");
        notifyAll();
    }

    synchronized void withdraw(int amount){
        System.out.println("going to withdraw...");
        if(this.amount<amount){
            System.out.println("Less balance; waiting for deposit...");
            try{wait();
            }catch(Exception e){}
        }
        this.amount-=amount;
        System.out.println("withdraw completed...");
    }

        synchronized void checking()
        {
            System.out.println("hshshsshs");
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            for(int i=0;i<5;i++){
                System.out.println("It is run or not");
            }

        }


}