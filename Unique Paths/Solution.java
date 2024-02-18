class Solution {

    public int uniquePaths(int m, int n) {
        return  helperTopDown(m-1, n-1);
        return  helperBottomUp(m, n);
        int dp[][] = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        return  helperTopDown(m-1, n-1,dp);
    }

    public int helperTopDown(int m, int n){

        if(m==0 && n==0) {
            return 1;
        } else if(m<0 || n<0) return 0;
        
        return helperTopDown(m-1, n)+ helperTopDown(m, n-1);

    }

    public int helperTopDown(int m, int n, int[][]dp){
        if(m==0 && n==0) {
            return 1;
        }
        if(m<0 || n<0) return 0;
        if(dp[m][n]!=-1){
            return dp[m][n];
        } 
        
        dp[m][n]= helperTopDown(m-1, n,dp)+ helperTopDown(m, n-1,dp);
        return dp[m][n];

    }

    public int  helperBottomUp(int m, int n){
            int grid[][]= new int[m][n];

        grid[m-1][n-1]=1;

        for(int i=0;i<n;i++){
            grid[m-1][i]=1;
        }

        for(int i=0;i<m;i++){
            grid[i][n-1]=1;
        }


        for(int i=m-2;i>=0;i--){
            for(int j = n-2;j>=0;j--){
                grid[i][j]= grid[i][j+1]+ grid[i+1][j];
            }
        }

        return grid[0][0];
        
    
    }

}