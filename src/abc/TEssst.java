package abc;

import java.util.Arrays;
import java.util.List;

public class TEssst {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1,2,3,4);
        //sum of squares of all numbers in list
        System.out.println(arr.stream().mapToInt(a-> a*a).sum());

        arr.stream().sorted((e1,e2) -> e2.compareTo(e1)).filter(a->a%2==0).limit(5).forEach(System.out::println);
    }
}
