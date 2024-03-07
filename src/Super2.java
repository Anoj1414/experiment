public class Super2 {
    public static void main(String[] args) {
        Dog d = new Dog();

    }
}
class Animal1{
        Animal1(){
            System.out.println("animal is created");
        }
        public Animal1 get(){
            return this;
        }

        Animal1(int a){
            System.out.println("it is a parameterized constructor");
        }
    }
    class Dog extends Animal1{

    public Dog get(){
        return null;
    }
        Dog(){
            //super(2);
            //super();
            //If you commment the parametrized constructor then you
            System.out.println("dog is created");
        }

    }


