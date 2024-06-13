package java9;


import java.util.*;
import java.util.stream.Collectors;

public class ThirdHighest {


    static Map<String, Integer>  map2 = new HashMap<>();



    public static void main(String[] args) {


        List a = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List b = a;
        System.out.println(b.add(3.14));

        map2.put("anil", 1000);
        map2.put("ankit", 1200);
        map2.put("bhavna", 1200);
        map2.put("james", 1200);
        map2.put("micael", 1000);
        map2.put("tom", 1300);
        map2.put("daniel", 1300);

        OptionalInt optionalInt = map2.values().stream().sorted(Comparator.reverseOrder()).limit(5).mapToInt(i-> i).findFirst();
        System.out.println(optionalInt.getAsInt());

        map2.entrySet().stream().filter(e -> e.getValue() == optionalInt.getAsInt()).forEach(e -> System.out.println(e.getKey()));

    }

}
