class Solution {
    public int change(int amount, int[] coins) {
        int[][] dp=new int[amount+1][coins.length+1];
        for(int[] num:dp){
            Arrays.fill(num,-1);
        }
        return Solve(coins,amount,0,dp);
    }
    public static int Solve(int[] c,int am,int i,int[][] dp){
        if(am==0)return 1;
        if(i==c.length)return 0;
        if(dp[am][i]!=-1)return dp[am][i];
        int inc=0;
        int exc=0;
        if(c[i]<=am){
            inc=Solve(c,am-c[i],i,dp);
        }
        exc=Solve(c,am,i+1,dp);
        return dp[am][i]=inc+exc;

    }
}