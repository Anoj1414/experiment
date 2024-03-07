
import java.util.concurrent.ConcurrentHashMap;

public class  Concurrenthashmap{
    public static void main(String[] args) {

        ConcurrentHashMap<String, Integer> numbers = new ConcurrentHashMap<>();
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        numbers.putIfAbsent("Three",4);
        numbers.putIfAbsent("four",4);
        System.out.println("ConcurrentHashMap: " + numbers);

        // forEach() without transformer function
        numbers.forEach(40, (k, v) -> System.out.println("key: " + k + " value: " + v));

        // forEach() with transformer function
        System.out.print("Values are ");
        numbers.forEach(2,(k, v) -> v, (v) -> System.out.print(v + ", "));
        System.out.println();
        System.out.println("keys are ");
        numbers.forEach(4, (k, v) -> k, (k) -> System.out.print(k + ", "));

    }
}

