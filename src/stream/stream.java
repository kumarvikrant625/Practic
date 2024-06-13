package stream;

import java.util.*;
public class stream {

    public static void main(String... args){
        Integer[] arr = {11, 22, 13, 44, 15};
        Integer[][] arr1 = {{11, 22, 13, 44, 15}, {12, 2, 13, 4, 15} , {1, 25, 3, 49, 55}};

        List<Integer> aa = Arrays.asList(arr);


        //Arrays.stream(arr).mapToInt(Integer::intValue).filter(x -> x > 20).forEach(System.out::println);
        Arrays.stream(arr1).sequential().flatMap(Arrays::stream).map(x -> x * 2).forEach(System.out::println);
    }

}
