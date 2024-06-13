package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortEachString {

    public static void main(String[] args) {
        List<String> arr = Arrays.asList("vikrant", "kumar", "singh", "rajput");
        String str1 = "Vikrantt";
        Arrays.stream(str1.split("")).toList();
        Map<String, Long> map = Arrays.stream(str1.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);
        str1 = "Vikrantt";
        Map<String, Long> map2 = Arrays.stream(str1.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        if(map.equals(map2))
            System.out.println("Equal");

        System.out.println(map);
        arr.stream().map(str -> str.chars().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString()).forEach(e -> System.out.println(e));
        List<String> arr1 =   arr.stream().map(str -> str.chars().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString()).collect(Collectors.toList());
        System.out.println(arr1);
    }
}
