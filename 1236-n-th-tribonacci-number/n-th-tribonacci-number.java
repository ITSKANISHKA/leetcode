class Solution {
    public int tribonacci(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return solve(n,dp);
        
    }
    public static int solve(int n,int[]dp){
        if(n==0)return 0;
        if(n==1 || n==2)return 1;
        dp[0]=0;
        dp[1]=1;
        dp[2]=1;
        if(dp[n]!=-1)return dp[n];
        for(int i=3;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
        }return dp[n];
    }
}