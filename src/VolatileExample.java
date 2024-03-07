
public class VolatileExample {

    // Initializing volatile variables
    // a, b


    public static void main(String[] args)
    {
        test t=new test();

        // Creating an instance t1 of
        // Thread class
        Thread t1 = new Thread() {
            public void run()
            {
                //Test t=new Test();
                for (int i = 0; i < 5; i++)
                   t.method_one();
            }
        };

        // Creating an instance t2 of
        // Thread class
        Thread t2 = new Thread() {
            public void run()
            {
                for (int i = 0; i < 5; i++)
                    t.method_two();
            }
        };

        // Starting instance t1 and t2
        t1.start();
        t2.start();
    }
}
class test{
    public int a = 0, b = 0;

    // Defining a static void method
   public  void method_one()
    {
        a++;
        b++;
        //System.out.println("method1");
    }

    // Defining static void method
    public void method_two()
    {
        System.out.println(
                "a=" + a + " b=" + b);
    }
}