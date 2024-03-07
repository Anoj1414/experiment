public class stringexmp3 {
    public static void main(String[] args) {
        String str = "Welcome to JavaTpoint";
        System.out.println(str.substring(12,20));
        int count = 0;
        int startFrom = 0;
        System.out.println("Samantha".matches("[a-zA-Z][a-zA-Z0-9]{7,30}"));
        System.out.println("sss".equals("ss"));
        while(true)
        {

            int index = str.indexOf('0', startFrom);

            if(index >= 0)
            {
                count = count + 1;

// start looking after the searched index
                System.out.println(startFrom);
                startFrom = index + 1;
            }

            else
            {
// the value of index is - 1 here. Therefore, terminate the loop
                break;
            }

        }

        System.out.println("In the String: "+ str);
        System.out.println("The 'o' character has come "+ count + " times");
    }


}

