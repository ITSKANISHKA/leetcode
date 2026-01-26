class Solution {
    public List<List<Integer>> subsets(int[] nums) {
       List <List <Integer>> subsets = new ArrayList<>();
        int subSet = (1<<nums.length);
        for(int n = 0 ; n < subSet ; n++){
            List <Integer> ans = new ArrayList<>(); 
            for(int i = 0; i < nums.length ; i++){
                if((n & ( 1 << i)) != 0){
                    ans.add(nums[i]);
                }
            }subsets.add(ans);
        }return subsets;
    }
}