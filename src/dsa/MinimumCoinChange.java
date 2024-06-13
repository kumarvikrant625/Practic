package dsa;

import java.util.HashMap;

public class MinimumCoinChange {

    public int minimumCoin(int []coins, int amount, int n){
        if(amount == 0){
            return 0;
        }
        if(n <= 0){
            return Integer.MAX_VALUE;
        }
        if(coins[n-1] <= amount){
            return Math.min(1+minimumCoin(coins, amount-coins[n-1], n), minimumCoin(coins, amount, n-1));
        }else{
            return minimumCoin(coins, amount, n-1);
        }
    }

    public int minimumCoin2(int []coins, int amount, int n){
        if(amount == 0){
            return 0;
        }
        int ans = 0;
        if(n <= 0){
            return Integer.MAX_VALUE;
        }

        for (int i = 0; i < n; i++) {
            if(coins[i] <= amount){
                int sub_res = minimumCoin2(coins, amount-coins[i], n);
                if(sub_res != Integer.MAX_VALUE){
                    ans = Math.min(ans, sub_res+1);
                }
            }
        }
        return ans;
    }



    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();
        Long a =  9646324351L;

        int[] coins = {1, 2, 3};
        int amount = 15;
        int n = coins.length;
        System.out.println(new MinimumCoinChange().minimumCoin(coins, amount, n));
        System.out.println(new MinimumCoinChange().minimumCoin2(coins, amount, n));

    }
}
