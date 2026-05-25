class Solution {
    public int alternatingSum(int[] nums) {
        int n=nums.length;
        int sum=0;
        int diff=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                sum+=nums[i];
            }else{
                diff+=nums[i];
            }
        }
        return sum-diff;
    }
}