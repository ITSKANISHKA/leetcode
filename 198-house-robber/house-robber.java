class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return Solve(dp,n-1,nums);
    }
    public static int Solve(int[] dp,int n,int[] nums){
        if(n<0)return 0;
        if(dp[n]!=-1)return dp[n];
        int one=nums[n]+Solve(dp,n-2,nums);
        int two=Solve(dp,n-1,nums);
        dp[n]=Math.max(one,two);
        return dp[n];
    }
}