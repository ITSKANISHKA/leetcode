class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int n = nums.length;
        int mid = nums[n / 2];
        int cnt = 0;
        for (int num : nums) {
            if (num == mid) {
                cnt++;
            }
        }
        return cnt==1;
    }
}