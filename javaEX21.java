import java.util.Calendar;
import java.util.Scanner;
public class javaEX21 {

    public static void main(String[] args) {
        Calendar start = Calendar.getInstance();
        start.set(2021, Calendar.OCTOBER, 1);
        Calendar end = Calendar.getInstance();
        end.set(2021, Calendar.OCTOBER, 31);
        System.out.print("Number of working days between " +
                start.getTime() + " and " + end.getTime() + " are: ");
        int numberOfDays = 0;
        while (start.before(end)) {
            if (start.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY||
                    start.get(Calendar.DAY_OF_WEEK) == Calendar.TUESDAY||
                    start.get(Calendar.DAY_OF_WEEK) == Calendar.WEDNESDAY||
                    start.get(Calendar.DAY_OF_WEEK) == Calendar.THURSDAY||
                    start.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY

            ) {
                numberOfDays++;
                start.add(Calendar.DATE, 1);
            } else {
                start.add(Calendar.DATE, 1);
            }
        }

        System.out.println(numberOfDays);
    }
}
