package java9;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WCString {


    public static int countWords(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        char[] words = str.toCharArray();
       // char[] words = Arrays.asList(str.toCharArray());
        return words.length;
    }

    public static void main(String[] args) {
       /* String str = "Hello World";
        System.out.println("Word count: " + countWords(str));*/

        String str = "Hi Hello Hi";
        List<String> s = Arrays.asList(str.split(""));
        Map<String, Long> hm =
                s.stream().collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting()));
        System.out.println(hm);
        hm.entrySet().forEach(entry -> {

            System.out.println(entry.getKey() + " " + entry.getValue());
        });

    }
}
