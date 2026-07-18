class Solution {
    public int findGCD(int[] nums) {
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int res=1;
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            if(nums[i]<min){
                min=nums[i];
            }
        }
        for(int i=1;i<=min;i++){
            if(min%i==0 && max%i==0 && i>res){
                res=i;
            }
        }return res;
        
    }
}