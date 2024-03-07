public class finalexmp {
    public static void main(String[] args) {

    }
}
class Bike10 {
    final int speedlimit;//blank final variable

    Bike10(int speedlimit) {
        this.speedlimit = speedlimit;
        // speedlimit = 70;
        System.out.println(this.speedlimit);
    }
    Bike10(){
        speedlimit = 70;
    }

    void n1(){
        //speedlimit=23;
    }
}