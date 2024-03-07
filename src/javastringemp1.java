public class javastringemp1 {
    public static void main(String[] args) {
        checkf f1=new checkf(25);
        System.out.println(f1.getNumber());
        f1.setNumber(56);
        System.out.println(f1.getNumber());
        String s1="this is javatpoint";
        for(int i=s1.length()-1; i>=0 ; i--){
            System.out.print(s1.charAt(i));
        }
        System.out.println();
        String s2="";
        String a[]=s1.split("\\s");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i].charAt(0));
            for(int j=0;j<a[i].length();j++){
                //just change the if else condition for the upper case word
                if(j==0){
                    //s2=s2+String.valueOf(a[i].charAt(j)).toUpperCase();
                   //s2= s2.toUpperCase();
                    s2=s2+a[i].charAt(j);
                    continue;
                }
                else{
                    //s2=s2+a[i].charAt(j);
                    s2=s2+String.valueOf(a[i].charAt(j)).toUpperCase();
                }
            }
            a[i]=s2;
            s2="";
        }
        for(int i=0;i<a.length;i++){
            s2=s2+a[i]+" ";
        }
        System.out.println(s2);


    }
    }
final class checkf{
    int number;

    public checkf(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
