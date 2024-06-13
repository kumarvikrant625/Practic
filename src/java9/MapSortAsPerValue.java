package java9;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


/*he number 39 will reduce as
Step 1 :(39 → 3x9 = 27) →
Step 2 : (27 → 2x7 =  14) →
Step 3 : (14 → 1x4 = 4)*/
public class MapSortAsPerValue {

    public static void main(String[] args) {

        Integer number = 27;
        String numstr = number.toString();
        String[] arr = numstr.split("");

        while(numstr.length() > 1 && arr.length > 1){
            Long num = 1L;
            for (int i = 0; i <arr.length ; i++) {
                num *= Integer.parseInt(arr[i]);
            }
            numstr = num+ "";
            arr = numstr.split("");
        }
        System.out.println(numstr);



    }
}
