class Solution {
    public int rob(int[] nums) {
       // int dp[]=new int[nums.length-1];
        int n=nums.length;
        int dp[]=new int[n-1];
        if(n==1)return nums[0];
        int[] arr1=new int[n-1];
        int[] arr2=new int[n-1];
        for(int i=0;i<n-1;i++){
            arr1[i]=nums[i];
        }for(int i=0;i<n-1;i++){
            arr2[i]=nums[i+1];
        }

        Arrays.fill(dp,-1);
        int one=Solve(arr1,arr1.length-1,dp);

        Arrays.fill(dp,-1);
        int two=Solve(arr2,arr2.length-1,dp);
        return Math.max(one,two);   
    }
    public int Solve(int[] arr,int i,int[] dp){
        if(i<0){
            return 0;
        }
        if(dp[i] != -1){
            return dp[i];
        }
        int rob=arr[i]+Solve(arr,i-2,dp);
        int drob=Solve(arr,i-1,dp);
        return dp[i]=Math.max(rob,drob);
    }
}