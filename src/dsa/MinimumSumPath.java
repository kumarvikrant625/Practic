package dsa;

public class MinimumSumPath {

    public static int minimumSumPath(int[][] matrix){

        int[][] dp = new int[matrix.length+1][matrix[0].length+1];
        for(int i =1; i<=matrix.length; i++){
            for(int j =1; j <= matrix[0].length; j++){
                dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + matrix[i-1][j-1];
            }
        }
        for (int i = 0; i <=matrix.length ; i++) {
            for (int j = 0; j <=matrix.length ; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println("");
        }
        return dp[matrix.length][matrix[0].length];
    }
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("Maximum sum will be " + minimumSumPath(matrix));
    }
}
