import java.util.Arrays;
import java.util.List;

public class ConditionalBreakPoint {
    public static void main(String[] args) {
        List<Integer> list1= Arrays.asList(1,2,3,4);
        for (int i = 0; i < list1.size(); i++)
        {
            System.out.println(list1.get(i));
        }
    }
}
