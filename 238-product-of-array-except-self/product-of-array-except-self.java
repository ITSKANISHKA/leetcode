class Solution {
    public int[] productExceptSelf(int[] nums) {
         int n=nums.length;
         int[] ans=new int[n];
         ans[0]=1;
         for(int i=1;i<n;i++){
            ans[i]=ans[i-1]*nums[i-1];
         }
         int point=1;
         for(int j=n-2;j>=0;j--){
            point*=nums[j+1];
            ans[j]=ans[j]*point;
         }
         return ans;
    }
}