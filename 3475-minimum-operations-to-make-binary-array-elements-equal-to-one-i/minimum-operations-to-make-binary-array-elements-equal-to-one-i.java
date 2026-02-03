class Solution {
    public int minOperations(int[] nums) {
        // int sum=0;
        // int len=nums.length;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==1){
        //         sum+=nums[i];
        //     }
        // }
        // return len-sum;
        int len=nums.length;
        int k=0;
        for(int i=0;i<len-2;i++){
            if(nums[i]==0){
                nums[i]^=1;
                nums[i+1]^=1;
                nums[i+2]^=1;
                k++;
            }
        }
        for(int num:nums){
                if(num==0)return -1;
            }return k;
        }
}