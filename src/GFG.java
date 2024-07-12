// Program to find the amount
/// of water in j-th glass
// of i-th row
import java.io.*;
import java.util.*;
import java.util.LinkedList;

// class Triplet which stores curr row
// curr col and curr rem-water
// of every glass
class Triplet
{
    int row;
    int col;
    double rem_water;
    Triplet(int row,int col,double rem_water)
    {
        this.row=row;this.col=col;this.rem_water=rem_water;
    }
}


public class GFG
{
    // Returns the amount of water
// in jth glass of ith row
    public static double findWater(int i,int j,int totalWater)
    {

        // stores how much amount of water present in every glass
        double dp[][] = new double[i+1][2*i+1];

        // store Triplet i.e curr-row , curr-col, rem-water
        Queue<Triplet> queue = new LinkedList<>();

        // we take the center of the first row for
        // the location of the first glass
        queue.add(new Triplet(0,i,totalWater));


        // this while loop runs unless the queue is not empty
        while(!queue.isEmpty())
        {
            // First we remove the Triplet from the queue
            Triplet curr = queue.remove();

            // as we know we have to calculate the
            // amount of water in jth glass
            // of ith row . so first we check if we find solutions
            // for the every glass of i'th row.
            // so, if we have calculated the result
            // then we break the loop
            // and return our answer
            if(curr.row == i)
                break;

            // As we know maximum capacity of every glass
            // is 1 unit. so first we check the capacity
            // of curr glass is full or not.
            if(dp[curr.row][curr.col] != 1.0)
            {
                // calculate the remaining capacity of water for curr glass
                double rem_water = 1-dp[curr.row][curr.col];

                // if the remaining capacity of water for curr glass
                // is greater than then the remaining capacity of total
                // water then we put all remaining water into curr glass
                if(rem_water > curr.rem_water)
                {
                    dp[curr.row][curr.col] += curr.rem_water;
                    curr.rem_water = 0;
                }
                else
                {
                    dp[curr.row][curr.col] += rem_water;
                    curr.rem_water -= rem_water;
                }
            }

            // if remaining capacity of total water is not equal to
            // zero then we add left and right glass of the next row
            // and gives half capacity of total water to both the
            // glass
            if(curr.rem_water != 0)
            {
                queue.add(new Triplet(curr.row + 1,curr.col -
                        1,curr.rem_water/2.0));
                queue.add(new Triplet(curr.row + 1,curr.col +
                        1,curr.rem_water/2.0));
            }
        }

        // return the result for jth glass of ith row
        return dp[i-1][2*j-1];
    }

    // Driver Code
    public static void main (String[] args)
    {
        int i = Integer.valueOf(args[0]), j = Integer.valueOf(args[1]);
        int totalWater = Integer.valueOf(args[2]); // Total amount of water
        System.out.print("Amount of water in " + j + "th glass of "+ i + "th row is:");
        System.out.format("%.6f", findWater(i, j, totalWater));
    }

}
// this code is contributed by Naresh Saharan and Sagar Jangra

