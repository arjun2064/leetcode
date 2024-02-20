class Solution {
    
    public int climbStairs(int n) {
        //0--0 
        //1--1
        //2--2
        //3--3
        //4--5

        if(n<0) return 0;
        if(n==0)return 1;
        int[]dp =new int[n+1];//becase stairs count starts from 1

        // return climbStairs(n-1)+climbStairs(n-2);
        // return climbStairsTopDown(n, dp);
        return climbStairsBotomUp(n, dp);
    }

    public int climbStairsTopDown(int n, int[] dp){

        if(n<0) return 0;
        if(dp[n]!=0)return dp[n];
        if(n==0 )return 1;
        
        dp[n]= climbStairsTopDown(n-1, dp)+climbStairsTopDown(n-2, dp);
        return dp[n];

    }

    public int climbStairsBotomUp(int n, int[] dp){
        dp[0]=1;
        dp[1]=1;
        
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }

      return dp[n];


    }
}