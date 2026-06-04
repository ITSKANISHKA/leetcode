class Solution {
    public int climbStairs(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return Solve(n,dp);
    }
    public static int Solve(int n,int[] dp){
        if(n<=1){
            return 1;
        }
        if(dp[n]!=-1)return dp[n];
        int One1=Solve(n-1,dp);
        int Two2=Solve(n-2,dp);
        dp[n]=One1+Two2;
        return dp[n];
    }
}
