class Solution {
    public int minOperations(int[] nums) {
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
            if(nums[len-1]==0 || nums[len-2]==0){
            return -1;
    }
    return k;
        }
}