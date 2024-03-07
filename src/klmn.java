import java.util.ArrayList;

class UseCaseOne {
    static void addition(int a, int b,ArrayList<Integer> m1){
        m1.add(a + b);
        m1.add(22);
        System.out.println("Sum in addition method is ");
     //return sum;
    }
    public static void main(String args[]) {
        int a=10,b=14,sum=0;
        ArrayList<Integer> a1= new ArrayList<>();
        addition(a,b,a1);
        System.out.println("Sum in main method is "+a1.get(0));
        System.out.println(a1.get(1));
    }
}


