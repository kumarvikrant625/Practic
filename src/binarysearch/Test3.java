package binarysearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test3 {

    public static void main(String[] args) {
        int[][] arr =  {{1,4},{2,5},{3,1},{4,5},{6,2}};
        List<List<Integer>> result = new LinkedList<>();
        int[] winner = new int[arr.length];
        int[] loser = new int[arr.length];

        for(int i =0; i< arr.length; i++){
            winner[i] = arr[i][0];
            loser[i] = arr[i][1];
        }

        List<Integer> arrList = new ArrayList<>();

        for(int i = 0; i< winner.length; i++){
            boolean isExists = false;
            int currentValue = winner[i];
            for(int j = 0 ; j< loser.length; j++) {
                if (currentValue == loser[j]) {
                    isExists = true;
                    break;
                }
            }
            if(!isExists){
                arrList.add(Integer.valueOf(winner[i]));
            }
        }
        result.add(arrList);
        arrList = new ArrayList<>();

        for(int i =0 ; i< loser.length; i++){
            int count =0;
            int value = loser[i];
            for(int j = 0; j< loser.length; j++){
                if(value == loser[j]){
                   count++;
                }
            }
            if(count == 1){
                arrList.add(Integer.valueOf(value));
            }
        }
        result.add(arrList);
        System.out.println(result);
    }
}
