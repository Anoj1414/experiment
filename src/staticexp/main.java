package staticexp;

public class main {

    static {
        System.out.println("main class static block is executed");
    }

    public static void main(String[] args) {

        System.out.println("main method is executed");
//        public static void wow(){
//            System.out.println("wow");
//        };

        new Inner().wow();
        new Inner().wow();

    }
    public static void wow(){

        System.out.println("wow");
    }


}
class Inner{
    int a;

    public static int count=0;
    public static void wow(){
        System.out.println("wow1");
        //n();
    }

    public  void n(){
        this.count++;
        wow();
    }

    static {
        System.out.println("we will see");
    }
}
