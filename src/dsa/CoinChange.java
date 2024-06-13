package dsa;

import java.util.stream.Stream;
//Possible Count for coin change by given coins taken in any numbers.
//For example, if coins are {1, 2, 3} and amount is 4, then there are 4 ways to change the amount:
public class CoinChange {

    public static int coinChange(int[] coins, int amount, int n) {
        if (amount == 0) {
            return 1;
        }
        if(amount < 0 || n <= 0)
            return 0;

        return coinChange(coins, amount - coins[n - 1], n)+ coinChange(coins, amount, n - 1);
    }


    public static void main(String[] args) {
        int[] coins = {1, 3, 5, 2};
        int amount = 6;
        int n = coins.length;
        System.out.println(coinChange(coins, amount, n));
        Object Stream = null;
        String input = "Java articles are Awesome";
    }
}
