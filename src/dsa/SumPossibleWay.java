package dsa;

public class SumPossibleWay {

    public static  int countWays(int[] arr, int sum){

        if(sum < 0){
            return 0;
        }
        if(sum == 0){
            return 1;
        }
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans += countWays(arr, sum - arr[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int sum = 5;
        System.out.println("Number of ways to get sum: " + countWays(arr, sum));
    }
}
