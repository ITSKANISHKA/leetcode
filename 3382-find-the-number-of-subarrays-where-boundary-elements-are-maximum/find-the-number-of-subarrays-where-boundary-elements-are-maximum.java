class Solution {
    public long numberOfSubarrays(int[] nums) {
        int n = nums.length;
        long[] ans = new long[n];
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && nums[s.peek()] <= nums[i]){
                if(nums[s.peek()] == nums[i]) ans[i] += ans[s.peek()];
                s.pop();
            }
            ans[i]++;
            s.push(i);
        }
        long sum = 0;
        for(int i=0;i<n;i++){
            sum += ans[i];
        }
        return sum;
    }
}