class Solution {
    public int rob(int[] nums) {
        int [] dp=new int[nums.length+1];
        Arrays.fill(dp,-1);
        return solve(nums,nums.length-1,dp);
    }
    public int solve(int[] nums,int i,int[] dp){
        if(i<0)return 0;
        if(dp[i]!=-1)return dp[i];
        int took=nums[i]+solve(nums,i-2,dp);
        int notook=solve(nums,i-1,dp);
        dp[i]= Math.max(took,notook);
        return dp[i];
    }
}