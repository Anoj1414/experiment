class Animal12 {
    void eat(){
        System.out.println("animal is eating...");
    }
}

class cat extends Animal12 {
    void eat(){

        System.out.println("dog is eating...");
    }
}

class BabyDog12 extends cat {
    public static void main(String args[]){
        Animal12 a=new BabyDog12();
        a.eat();
    }
}
