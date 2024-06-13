package dsa;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCommonCharactersInString {

    public static Map<String, Long> getCharacterCount(String str){

       return Arrays.stream(str.split("")).sequential().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    public static Map<String, Long> findCommonCharacters(List<String> list){
        return list.stream().map(CountCommonCharactersInString::getCharacterCount).reduce((map1, map2) -> {
            map1.keySet().retainAll(map2.keySet());
            map1.keySet().forEach(key -> map1.put(key, Math.min(map1.get(key), map2.get(key))));
            return map1;
        }).orElse(null);
    }


    public static void main(String[] args) {
        List<String> list = Arrays.asList("bella", "label", "roller");

        System.out.println(findCommonCharacters(list));
    }


}

