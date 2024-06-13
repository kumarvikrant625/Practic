package binarysearch;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test4 {

    public static void main(String[] args) {
        String pangram = "The quick brown fox jumps over the lazy do";

        Map<String, Long> result = Arrays.stream(pangram.split("")).map(e-> e.toLowerCase()).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        boolean isPanogram = true;
        for (int i = 97; i < 123; i++) {
            if(result.get(String.valueOf((char)i)) == null){
                isPanogram = false;
            }
            if(!isPanogram){
                System.out.println(" This is not a panogram: "+(char)i + " is missing");
                return;
            }
        }
        if(isPanogram){
            System.out.println("This is a panogram");
        }

    }
}
