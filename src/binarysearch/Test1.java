package binarysearch;

import java.util.*;
import java.util.stream.Collectors;

public class Test1 {


    public static void getMin(int [] arr){
        int[] result = new int[2];
        int finalsum = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for(int j = i ; j < arr.length ; j++){
                sum += arr[j];
                if(sum < finalsum){
                    result[0] = i;
                    result[1] = j;
                    finalsum = Math.min(finalsum, sum);
                }
            }
        }
        System.out.println("Start index: "+result[0]+" End index: "+result[1]);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, -3, -4, 5, 9, -1, 10};
        Set<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toSet());
        System.out.println(list);
        getMin(arr);
    }


}
