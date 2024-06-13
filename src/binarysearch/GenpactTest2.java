package binarysearch;


import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GenpactTest2 {

    public static void main(String[] args) {
        List<Character>  list = List.of('H', 'e', 'l', 'l', 'o', 'W', 'o', 'r', 'l', 'd');
       Map<Character, Long> map =  list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));




    }


}
