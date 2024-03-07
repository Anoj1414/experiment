public class thisclassex
{
    public static void main(String[] args) {
           A4 a4=new A4();

    }

}
class CD{
    A4 obj;
    CD(A4 obj){
        this.obj=obj;
    }
    void display(){

        System.out.println(obj.data);//using data member of A4 class
    }
}

class A4 {
    int data;

    A4() {
        CD b = new CD(this);

        b.display();
        this.data=20;
        b.display();
    }

}

