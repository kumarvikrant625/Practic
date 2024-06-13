package abc;

import java.util.Arrays;

public class Testtttt {

    public static void main(String[] args) {
       // int arr[] = {36, 41, 56, 35, 44, 33, 34, 92, 43, 32, 42};
        int arr[] = {1, 9, 3, 10, 4, 20, 2};
        Arrays.sort(arr);
        int minimum =  arr[0];
        int maxCount = 0;
        int count = 1;

        for(int i = 1 ; i < arr.length; i++){
            if(minimum+1 == arr[i]){
                count++;
                minimum +=1;
            }else if (arr[i] > minimum+1){
                minimum = arr[i];
                count = 1;
            }
            maxCount = Math.max(maxCount, count);

        }

        System.out.println(maxCount);

    }
}
