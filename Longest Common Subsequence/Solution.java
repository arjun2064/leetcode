class Solution {
    public int longestCommonSubsequence(String text1, String text2) {

        return longestCommonSubsequenceRec(text1.toString(),text2.toString(), 0,0, new int[text1.length()][text2.length()]);
    }

       public static int longestCommonSubsequenceRec(String a,String b,int i,int j, int[][]dp)
    {
        if(i == a.length() || j == b.length())
            return 0;
        if(dp[i][j] != 0)
            return dp[i][j];

        int ans = 0;
        if(a.charAt(i) == b.charAt(j))
        {
            ans = 1 + longestCommonSubsequenceRec(a,b,i+1,j+1,dp);
        }
        else
        {
            ans = 0 + Math.max(longestCommonSubsequenceRec(a,b,i,j+1,dp),longestCommonSubsequenceRec(a,b,i+1,j,dp));
        }
        dp[i][j]=ans;
        return dp[i][j];
    }

    public int longestCommonSubsequenceBotumUp(String a, String b) {
        int n1=a.length();
        int n2=b.length();
        if(n1==0 || n2==0)
        return 0;
        int[][] dp=new int[n1+1][n2+1];
        for(int i=n1-1;i>=0;i--){
            for(int j=n2-1;j>=0;j--){
                if(a.charAt(i)==b.charAt(j)){
                    dp[i][j]=1+dp[i+1][j+1];
                }else{
                    dp[i][j]=Math.max(dp[i][j+1],dp[i+1][j]);
                }
            }
        }
        return dp[0][0];
    }

}