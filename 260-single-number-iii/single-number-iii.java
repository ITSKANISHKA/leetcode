class Solution {
    public int[] singleNumber(int[] nums) {
       HashMap<Integer,Integer> map=new HashMap<>();
       int n=nums.length;
       int ans[]=new int[2];
       for(int i=0;i<n;i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
       }
       int k=0;
       for(int i=0;i<n;i++){
        if(map.get(nums[i])==1){
            ans[k++]=nums[i];
        }
       }return ans;
    }
}