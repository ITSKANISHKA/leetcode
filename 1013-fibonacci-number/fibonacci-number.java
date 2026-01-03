class Solution {
    public int fib(int n) {
       int[] dp=new int[n+1];
       Arrays.fill(dp,-1);
       return Solve(n,dp);
    }
    public static int Solve(int n,int[] dp){
        if(n==0)return 0;
        if(n==1)return 1;
        if(dp[n]!=-1){
            return dp[n];
        }
        return dp[n]=Solve(n-1,dp)+Solve(n-2,dp);
    }
}