class Solution {
    public int singleNumber(int[] nums) {
    //    HashMap<Integer,Integer> map=new HashMap<>();
    //    int n=nums.length;
    //    int ans=0;
    //    for(int i=0;i<n;i++){
    //     map.put(nums[i],map.getOrDefault(nums[i],0)+1);
    //    }
    //    for(int i=0;i<n;i++){
    //     if(map.get(nums[i])!=3){
    //         ans=nums[i];
    //     }
    //    }return ans;

    Arrays.sort(nums);
    for(int i=1;i<nums.length;i+=3){
        if(nums[i]!=nums[i-1]){
            return nums[i-1];
        }
    }return nums[nums.length-1];
    }
}