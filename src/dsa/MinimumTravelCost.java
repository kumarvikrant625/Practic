package dsa;

/*
MinimumTravelCost for a person to reach destination city from source city.
two array
cost = {2, 7, 15} for cost[0] = daily, cost[1] = weekly, cost[2] = monthly
travel={ 1,4,6,7,8,20}  person wants to travel 1,4,6,7,8,20 days only.
*/

public class MinimumTravelCost {


    public int solve(int []cost, int []travel, int n , int index){

        if(index >= n){
            return 0;
        }

        int option1 = cost[0] + solve(cost, travel, n, index+1);

        for (int j = index; j < n && travel[j] < travel[index]+7; j++);
        int option2 = cost[1] + solve(cost, travel, n, index+7);

        for (int j= index; j < n && travel[j] < travel[index]+30; j++) ;
        int option3 = cost[2] + solve(cost, travel, n, index+30);

        int result = Math.min(option3, Math.min(option1, option2));

        return  result;
    }

    public static void main(String[] args) {
        int []cost = {2,7,15};
        int []travel = {2,5};
        int n = travel.length;
        System.out.println(new MinimumTravelCost().solve(cost, travel, n, 0));

    }
}
