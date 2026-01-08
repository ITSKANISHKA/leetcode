class Solution {
    public int countHousePlacements(int n) {
        long[] dp=new long[n+1];
        Arrays.fill(dp,-1);
        long res=Solve(n,dp);
        return (int)((res*res)%1000000007L);
    }
    public static long Solve(int n,long[] dp){
        if(n<=1)return n+1;
        if(dp[n]!=-1)return dp[n];
        long up=Solve(n-1,dp);
        long down=Solve(n-2,dp);
        dp[n]=(up+down)%1000000007L;
        return dp[n];
    }
}