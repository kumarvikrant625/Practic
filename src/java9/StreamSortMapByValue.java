package java9;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamSortMapByValue {

    public static void main(String[] args) {
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("A", 3);
        myMap.put("B", 1);
        myMap.put("C", 2);

// Sort entries by value in ascending order and print them

       /* myMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));*/

        myMap.entrySet().stream().sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue())).forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
        Map<String, Integer> sortedMap = myMap.entrySet().stream().sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue())).collect(Collectors.toMap(e-> e.getKey(), e-> e.getValue(), (e1, e2) -> e1, LinkedHashMap::new));

        System.out.println(sortedMap);
       // Sort entries by value in descending order and collect to a new Map


    }
}
