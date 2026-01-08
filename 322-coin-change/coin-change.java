class Solution {
    public int coinChange(int[] coins, int amount) {
        int[][] dp=new int[amount+1][coins.length];
        for(int[] num:dp){
            Arrays.fill(num,-1);
        }
        int ans=Solve(coins,amount,0,dp);
        return ans >= 1000000000 ? -1 : ans;
    }
    public static int Solve(int[] c,int am,int i,int[][] dp){
        if(am==0)return 0;
        if(i==c.length||am<0)return 1000000000;
        if(c[i]>am) return Solve(c,am, i+1, dp);
        if(dp[am][i]!=-1)return dp[am][i];
        int inc=1+Solve(c,am-c[i],i,dp);
        int exc=Solve(c,am,i+1,dp);
        return dp[am][i]=Math.min(inc,exc);

    }
}