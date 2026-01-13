class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        int target=0;
        for(int i=0;i<n-2;i++){
            target=-nums[i];
            int j=i+1;
            int k=n-1;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            while(j<k){
                if(target==nums[j]+nums[k]){
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    while(j<k && nums[j]==nums[j+1]){
                    j++;
                }while(j<k && nums[k]==nums[k-1]){
                    k--;
                }j++;
                k--;
                }
                else if(target<nums[j]+nums[k]){
                    k--;
                }else{
                    j++;
                }
            }
        }return ans;
    }
}