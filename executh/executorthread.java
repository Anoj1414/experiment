package executh;

import java.io.IOException;
import java.util.concurrent.*;

public class executorthread {
    public static void main(String[] args) {
        ExecutorService executer= Executors.newFixedThreadPool(2);
        Runnable task1=new message(1);
        executer.execute(task1);
        message  task2=new message(2);
        executer.execute(task2);
        Runnable task3=new message(3);
        executer.execute(task3);
        Runnable task4=new message(4);
        executer.execute(task4);
        Runnable task5=new message(5);
        executer.execute(task5);
        CallableMessage task = new CallableMessage();
        Future<String> message = executer.submit(task);
        try {
            System.out.println(message.get().toString());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }

        executer.shutdown();
        //executer.shutdownNow();
        while (!executer.isTerminated()){
    }
        System.out.println("submit all the tasks");
}}
class message implements Runnable{
    int msid;
    public message(int msid) {

        this.msid = msid;
    }

    @Override
    public void run()  {
        System.out.println("wow thread you are start doing"+Thread.currentThread().getName()+"WORK IS "+msid);
        respondmessage();
        System.out.println("wow thread you are done the task"+Thread.currentThread().getName()+"work is "+ msid);
    }
    public void respondmessage(){
        try{
            Thread.sleep(2000);
        }
        catch (InterruptedException e){
            System.out.println(e);
        }
    }
}


class CallableMessage implements Callable<String> {
    public String call() throws Exception{
        return "Hello World!";
    }
}
